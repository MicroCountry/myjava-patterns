package MyJava.patterns.chain.responsibility;

public class JiaMu extends Player {

	public JiaMu(Player aSuccessor){
		this.setSuccessor(aSuccessor);
	}
	
	@Override
	public void handle(int i) {
		if(i==1){
			System.out.println("Jiamu gotta drink!");
		}else{
			System.out.println("Jiamu passed!");
			next(i);
		}
	}

	@Override
	public void handle() {
		if(DrumBeater.stopped){
			System.out.println("Jiamu gotta drink!");
		}else{
			System.out.println("Jiamu passed!");
			next();
		}
	}

}
