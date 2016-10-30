package MyJava.patterns.chain.responsibility;

public abstract class Player {
	public abstract void handle(int i);
	public abstract void handle();
	private Player successor;
	public Player(){
		successor=null;
	}
	protected void setSuccessor(Player aSuccessor){
		this.successor = aSuccessor;
	}
	public void next(int index){
		if(this.successor!=null){
			successor.handle(index);
		}else{
			System.out.println("program terminater");
			System.exit(0);
		}
	}
	public void next(){
		if(this.successor!=null){
			successor.handle();
		}else{
			System.out.println("program terminater");
			System.exit(0);
		}
	}
	
	
}
