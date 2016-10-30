package MyJava.patterns.prototype;

import java.io.IOException;

public class TheGreatestSage {
	private Monkey monkey= new Monkey();
	
	public void change() throws ClassNotFoundException, IOException{
		Monkey copyMonkey;
		for(int i=0;i<2000;i++){}
		//copyMonkey = (Monkey) monkey.clone();
		copyMonkey = (Monkey) monkey.deepClone();
		System.out.println("Monkey King's birth date="+monkey.getBirthDate());
		System.out.println("Copy monkey's birth date="+copyMonkey.getBirthDate());
		System.out.println("Monkey==CopyMonkey?"+(monkey==copyMonkey));
		System.out.println("Monkey King's Staff==Copy Monkey's Staff?"+(monkey.getStaff()==copyMonkey.getStaff()));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		TheGreatestSage sage = new TheGreatestSage();
		sage.change();
	}
}
