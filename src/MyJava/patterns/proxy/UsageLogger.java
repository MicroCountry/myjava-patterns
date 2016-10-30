package MyJava.patterns.proxy;

public class UsageLogger {
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void save(){
		String sql =""+userId;
	}
	
	public void save(String userId){
		this.userId = userId;
		save();
	}
}
