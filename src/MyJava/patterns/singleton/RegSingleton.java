package MyJava.patterns.singleton;

import java.util.HashMap;

public class RegSingleton {
	static private HashMap m_registry = new HashMap();
	static{
		RegSingleton x = new RegSingleton();
		m_registry.put(x.getClass().getName(), x);
	}
	protected RegSingleton(){
		
	}
	
	static public RegSingleton getInstance(String name){
		if(name==null){
			name = "MyJava.patterns.singleton.RegSingleton";
		}
		if(m_registry.get(name)==null){
			try {
				m_registry.put(name, Class.forName(name).newInstance());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return (RegSingleton) m_registry.get(name);
	}
	
	public void abort(){
		System.out.println("this is regsingleton");
	}
}
