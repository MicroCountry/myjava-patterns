package MyJava.patterns.multiton;

import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

public class LingualResource {
	private String language = "en";
	private String region ="US";
	private String localCode="en_US";
	private final static String FILE_NAME="res";
	private static HashMap<String,Object> instances = new HashMap<String,Object>(19);
	private Locale locale=null;
	private ResourceBundle resourceBundle=null;
	private LingualResource lnkLingualResource;
	private LingualResource(String language,String region){
		this.localCode=language;
		this.region= region;
		localCode=makeLocalCode(language,region);
		locale=new Locale(language,region);
		resourceBundle=	ResourceBundle.getBundle(FILE_NAME, locale);
		instances.put(makeLocalCode(language, region), this);
	}
	private LingualResource(){}
	public synchronized static LingualResource getInstance(String language,String region){
		if(instances.get(makeLocalCode(language,region))!=null){
			return (LingualResource) instances.get(makeLocalCode(language,region));
		}else{
			return new LingualResource(language,region);
		}
	}
	public String getLocaleString(String code){
		return resourceBundle.getString(code);
	}
	private static String makeLocalCode(String language,String region){
		return language+"_"+region;
	}
}
