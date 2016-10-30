package MyJava.patterns.observer;
import java.util.Observer;
public class Tester {
	private static Watched watched;
	private static Observer watcher;
	public static void main(String[] args) {
		watched = new Watched();
		watcher = new Watcher(watched);
		watched.changeData("in c");
		watched.changeData("in java");
		watched.changeData("in java");
		watched.changeData("in python");
	}
}
