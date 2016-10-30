package MyJava.patterns.chain.responsibility;

import java.util.Timer;
import java.util.TimerTask;

public class DrumBeater {
	private static Player firstPlayer;
	public static boolean stopped = false;
	Timer timer;
	public static void main(String[] args) {
		DrumBeater drumBeater = new DrumBeater();
		JiaMu jiaMu = new JiaMu(null);
		jiaMu.setSuccessor(new JiaShe(new JiaZheng(new JiaBoYu(new JiaHuan(jiaMu)))));
		drumBeater.setBeating(1);
		firstPlayer = jiaMu;
		firstPlayer.handle();
	}
	public void setBeating(int stopInSeconds){
		System.out.println("Drum beating started...");
		timer = new Timer();
		timer.schedule(new StopBeatingReminder(), stopInSeconds*10);
	}
	
	class StopBeatingReminder extends TimerTask{

		@Override
		public void run() {
			System.out.println("Drum beating stopped!");
			stopped = true;
			timer.cancel();
		}
		
	}
}
