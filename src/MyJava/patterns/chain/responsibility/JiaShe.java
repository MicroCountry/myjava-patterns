package MyJava.patterns.chain.responsibility;

public class JiaShe extends Player {

	public JiaShe(Player aSuccessor){
		this.setSuccessor(aSuccessor);
	}
	@Override
	public void handle(int i) {
		if(i==2){
			System.out.println("Jia She gotta drink!");
		}else{
			System.out.println("Jia She passed!");
			next(i);
		}
	}
	@Override
	public void handle() {
		if(DrumBeater.stopped){
			System.out.println("Jia She gotta drink!");
		}else{
			System.out.println("Jia She passed!");
			next();
		}
	}

}
