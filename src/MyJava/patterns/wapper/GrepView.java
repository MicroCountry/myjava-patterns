package MyJava.patterns.wapper;

import java.io.PrintStream;

public class GrepView {
	PrintStream out;
	public GrepView(){
		out=System.out;
	}
	
	public void println(String line){
		System.out.println(line);
	}
}
