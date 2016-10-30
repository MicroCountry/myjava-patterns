package MyJava.patterns.composite.drawingtransaprent;

import java.util.Vector;

public class Picture extends Graphics{

	private  Vector list = new Vector(10);
	@Override
	public void draw() {
		for(int i=0;i<list.size();i++){
			Graphics g = (Graphics) list.get(i);
			g.draw();
		}
	}

	@Override
	public void add(Graphics g) {
		list.add(g);
	}

	@Override
	public void remove(Graphics g) {
		list.remove(g);
	}

	@Override
	public Graphics getChild(int i) {
		return (Graphics)list.get(i);
	}

}
