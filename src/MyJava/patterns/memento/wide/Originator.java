package MyJava.patterns.memento.wide;

public class Originator {
	private String state;
	public Originator(){
		
	}
	public MementoIF createMemento(){
		return new Memento(this.state);
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
		System.out.println("state="+state);
	}
	
	public void restoreMemento(MementoIF memento){
		Memento aMemento = (Memento) memento;
		this.setState(aMemento.getState());
	}
	
	class Memento implements MementoIF{
		private String saveState;
		private Memento(String state){
			this.saveState = state;
		}
		private String getState() {
			return saveState;
		}
		private void setState(String state) {
			this.saveState = state;
		}
		
	}
	
}
