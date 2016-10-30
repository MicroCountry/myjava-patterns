package MyJava.patterns.state;

public interface TcpState {
	void open();
	void close();
	void acknowledge();
}
