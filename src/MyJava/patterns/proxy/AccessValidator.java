package MyJava.patterns.proxy;

public class AccessValidator {
	public boolean validateUser(String userId){
		if(userId.equals("admin")){
			return true;
		}else{
			return false;
		}
	}
}
