package MyJava.patterns.adapter;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

import org.xml.sax.SAXException;

public class XMLProperties extends Properties{
	XMLParser p =null;
	public synchronized void load(InputStream in) throws IOException{
		try {
			p= new XMLParser(in,this);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void load(File file) throws SAXException, IOException{
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		XMLParser p =null;
		p=new XMLParser(in,this);
	}
	
	public synchronized void save(OutputStream out,String header){
		store(out,header);
	}
	
	public  synchronized void store(OutputStream out,String header){
		PrintWriter wout=new PrintWriter(out);
		wout.println("<?xml version='1.0'?>");
		if(header==null){
			wout.println("<!-- header -->");
		}
		wout.println("<properties>");
		for(Enumeration e=keys();e.hasMoreElements();){
			String key=(String) e.nextElement();
			String val = (String)get(key);
			wout.println("\n <key name=\""+key+"\">");
			wout.println(encode(val));
			wout.println("</key>");
		}
		wout.println("\n</properties>");
		wout.flush();
	}
	
	protected StringBuffer encode(String string){
		int len =string.length();
		StringBuffer buffer = new StringBuffer(len);
		char c;
		for(int i=0;i<len;i++){
			switch(c=string.charAt(i)){
			case '&':
				buffer.append("&amp;");
				break;
			case '>':
				buffer.append("<");
				break;
			case '<':
				buffer.append(">");
				break;
			default:
				buffer.append(c);
		    }
		}
		return buffer;
	}
	
	public XMLProperties(){
		super();
	}
}
