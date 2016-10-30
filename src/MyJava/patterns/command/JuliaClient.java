package MyJava.patterns.command;

public class JuliaClient {
	private static Keypad keypad;
	private static AudioPlayer myAudio = new AudioPlayer();
	public static void main(String[] args) {
		test2();
	}
	private static void test1(){
		Command play = new PlayCommand(myAudio);
		Command rewind = new RewindCommand(myAudio);
		Command stop = new StopCommand(myAudio);
		keypad = new Keypad(play,rewind,stop);
		keypad.play();
		keypad.stop();
		keypad.rewind();
		keypad.stop();
		keypad.play();
		keypad.stop();
	}
	
	private static void test2(){
		Command play = new PlayCommand(myAudio);
		Command rewind = new RewindCommand(myAudio);
		Command stop = new StopCommand(myAudio);
		MacroCommand macro = new MacroAudioCommand();
		macro.add(play);
		macro.add(stop);
		macro.add(rewind);
		macro.add(stop);
		macro.add(play);
		macro.add(stop);
		macro.execute();
	}
}
