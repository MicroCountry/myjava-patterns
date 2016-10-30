package MyJava.patterns.command;

public class Keypad {
	private Command playCmd;
	private Command rewindCmd;
	private Command stopCmd;
	
	public Keypad(Command playCmd,Command rewindCmd,Command stopCmd){
		this.playCmd = playCmd;
		this.rewindCmd = rewindCmd;
		this.stopCmd = stopCmd;
	}
	
	public void play(){
		this.playCmd.execute();
	}
	
	public void rewind(){
		this.rewindCmd.execute();
	}
	
	public void stop(){
		this.stopCmd.execute();
	}
}
