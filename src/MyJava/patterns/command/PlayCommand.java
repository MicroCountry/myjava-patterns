package MyJava.patterns.command;

public class PlayCommand implements Command {

	private AudioPlayer myAudio;
	
	public PlayCommand(AudioPlayer myAudio){
		this.myAudio = myAudio;
	}
	@Override
	public void execute() {
		this.myAudio.play();
	}

}
