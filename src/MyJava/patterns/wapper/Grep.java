package MyJava.patterns.wapper;

import java.io.FileReader;
import java.io.IOException;

public class Grep {
	static GrepReader g;
	private static GrepView gv = new GrepView();
	public static void main(String[] args) throws IOException {
		args =new String[2];
		args[0]="property";
		args[1]="/home/cr7/my.xml";
		String line;
		if(args.length<=1){
			gv.println("Usage :java Grep");
			gv.println("      no regexp");
			gv.println("      files to be searched in");
			System.exit(1);
		}
		
		try {
			gv.println(" \nGrep:  search:"+args[0]+	"  file:"+args[1]);
			gv.println("file and line number \t\t contains search char\n");
			g=new GrepReader(new FileReader(args[1]), args[0]);
			
			for(;;){
				line=g.readLine();
				if(line==null) break;
				gv.println(args[1]+":"+g.getLineNumber()+":\t"+line);
				g.close();
			}
		} catch (Exception e) {
			gv.println(e.getMessage()	);
		}
		
		
	}
}
