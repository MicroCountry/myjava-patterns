package MyJava.patterns.adapter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.management.RuntimeErrorException;

import org.xml.sax.AttributeList;
import org.xml.sax.DocumentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;

public class XMLParser implements DocumentHandler {
	private final static int IN_NOTHING=0;
	private final static int IN_DOCUMENT=1;
	private final static int IN_KEY=2;
	private int state = IN_NOTHING;
	private String key;
	private StringBuffer value;
	private Parser parser;
	private Class parserClass=null;
	private Properties xmlprop = null;
	public static final String PARSER_P="org.apache.xerces.pares.SAXParser";
	
	public Class getParserClass() throws ClassNotFoundException{
		if(parserClass==null)
			parserClass=Class.forName(PARSER_P);
		return parserClass;
	}
	
	private Parser getParser(){
		try {
			return 	(Parser)getParserClass().newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("");
		}
	}
	
	public XMLParser(InputStream in,XMLProperties xmlprop) throws SAXException, IOException{
		this.xmlprop = xmlprop;
		state = IN_NOTHING;
		value=new StringBuffer();
		parser=getParser();
		parser.setDocumentHandler(this);
		parser.parse(new InputSource(in));
		
	}
	public void startElement (String name, AttributeList atts) throws SAXException{
		if(state==IN_NOTHING){
			if(name.equals("properties")){
				state = IN_DOCUMENT;
			}else{
				throw new SAXException("attempt to find root properties");
			}
		}else if(state==IN_DOCUMENT){
			if(name.equals("key")){
				state=IN_KEY;
				key=atts.getValue("name");
				if(key==null){
					throw new SAXException("no name for key "+atts);
				}
			}else{
				throw new SAXException("attempt to find key");
			}
		}else{
			throw new SAXException("invalid element "+name);
		}
	}

	public void endElement(String name){
		if(state==IN_KEY){
			xmlprop.setProperty(key, value.toString());
			state=IN_DOCUMENT;
			name=null;
			value=new StringBuffer();
		}else if(state==IN_DOCUMENT){
			state=IN_NOTHING;
		}
	}
	@Override
	public void setDocumentLocator(Locator locator) {
		// TODO Auto-generated method stub

	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(state==IN_KEY){
			compute(ch,start,length);
		}
	}
	
	private void compute(char[] ch,int start,int length){
		int st=start;
		int len=length-1;
		while(st<length&&((ch[st]=='\n')||(ch[st]=='\t')||(ch[st]==' ')||(ch[st]=='\r'))){
			st++;
		}
		while(len>0&&((ch[len]=='\n')||(ch[len]=='\t')||(ch[len]==' ')||(ch[len]=='\r'))){
			len--;
		}
		value.append(ch[st]);
		st++;
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub

	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {
		// TODO Auto-generated method stub

	}

}
