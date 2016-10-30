package MyJava.patterns.chain.responsibility;

public class TestDrink {
	private static Player player;
	public static void main(String[] args) {
		player = new JiaMu(new JiaZheng(new JiaBoYu(new JiaHuan(null))));
		player.handle(4);
	}
}
