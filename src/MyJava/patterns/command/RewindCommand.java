package MyJava.patterns.command;

public class RewindCommand implements Command {

	private AudioPlayer audioPlayer;
	public RewindCommand(AudioPlayer audioPlayer){
		this.audioPlayer = audioPlayer;
	}
	@Override
	public void execute() {
		this.audioPlayer.rewind();
	}

}
