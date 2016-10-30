package MyJava.patterns.chain.responsibility;

public class JiaHuan extends Player {

	public JiaHuan(Player aSuccessor){
		this.setSuccessor(aSuccessor);
	}
	@Override
	public void handle(int i) {
		if(i==5){
			System.out.println("JiaHuan gotta drink!");
		}else{
			System.out.println("JiaHuan passed!");
			next(i);
		}
	}
	@Override
	public void handle() {
		if(DrumBeater.stopped){
			System.out.println("JiaHuan gotta drink!");
		}else{
			System.out.println("JiaHuan passed!");
			next();
		}
	}

}
