package MyJava.patterns.chain.responsibility;

public class JiaBoYu extends Player {

	public JiaBoYu(Player aSuccessor){
		this.setSuccessor(aSuccessor);
	}
	@Override
	public void handle(int i) {
		if(i==4){
			System.out.println("JiaBoYu gotta drink!");
		}else{
			System.out.println("JiaBoYu passed!");
			next(i);
		}
	}
	@Override
	public void handle() {
		if(DrumBeater.stopped){
			System.out.println("JiaBoYu gotta drink!");
		}else{
			System.out.println("JiaBoYu passed!");
			next();
		}
	}

}
