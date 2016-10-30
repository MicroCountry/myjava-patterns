package MyJava.patterns.state;

public class TcpConnection {
	private TcpState state;
	public void setState(TcpState state){
		this.state = state;
	}
	public void open(){
		state.open();
	}
	public void close(){
		state.close();
	}
	public void ackowledge(){
		state.acknowledge();
	}
}
