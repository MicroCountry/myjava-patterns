package MyJava.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
	private static final String PFILE = System.getProperty("user.dir")+File.separator+"Singleton.properties";
	private File file=null;
	private Long lastModifiedTime =0L;
	private Properties props = null;
	private static final ConfigManager instance = new ConfigManager();
	private ConfigManager(){
		file = new File(PFILE);
		lastModifiedTime =file.lastModified();
		if(lastModifiedTime ==0L){
			System.out.println(PFILE+" file does not exist!");
		}
		props = new Properties();
		try {
			props.load(new FileInputStream(PFILE));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized static public ConfigManager getInstance(){
		return instance;
	}
	
	public final Object getConfigItem(String name,Object defaultVal){
		Long  newTime = file.lastModified();
		if(newTime==0){
			if(lastModifiedTime==0){
				System.out.println(PFILE+" file does not extit!");
			}else{
				System.out.println(PFILE+ " file was deleted!");
			}
			return defaultVal;
		}else if(newTime > lastModifiedTime){
			props.clear();
			try {
				props.load(new FileInputStream(PFILE));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		lastModifiedTime = newTime;
		Object val =props.getProperty(name);
		if(val==null){
			return defaultVal;
		}else{
			return val;
		}
	}
}
