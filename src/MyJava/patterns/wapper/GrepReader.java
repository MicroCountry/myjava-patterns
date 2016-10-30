package MyJava.patterns.wapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;

public class GrepReader extends FilterReader {
	protected String subString;
	protected BufferedReader in;
	private int lineNumber;

	protected GrepReader(FileReader in,String subString) {
		super(in);
		this.in = new BufferedReader(in);
		this.subString = subString;
		this.lineNumber =0;
	}
	
	public final  String readLine() throws IOException{
		String line;
		do{
			line=in.readLine();
			lineNumber++;
		}while((line!=null)&&line.indexOf(subString)==-1);
		return line;
	}

	public int getLineNumber(){
		return lineNumber;
	}
}
