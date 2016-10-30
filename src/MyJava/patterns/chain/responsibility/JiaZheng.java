package MyJava.patterns.chain.responsibility;

public class JiaZheng extends Player {

	public JiaZheng(Player aSuccessor){
		this.setSuccessor(aSuccessor);
	}
	@Override
	public void handle(int i) {
		if(i==3){
			System.out.println("JiaZheng gotta drink!");
		}else{
			System.out.println("JiaZheng passed!");
			next(i);
		}
	}
	@Override
	public void handle() {
		if(DrumBeater.stopped){
			System.out.println("JiaZheng gotta drink!");
		}else{
			System.out.println("JiaZheng passed!");
			next();
		}
	}

}
