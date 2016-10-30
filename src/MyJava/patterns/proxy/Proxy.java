package MyJava.patterns.proxy;

public class Proxy implements Searcher {

	private RealSearcher searcher;
	private UsageLogger usageLogger;
	private AccessValidator accessValidator;
	
	public Proxy(){
		searcher =new RealSearcher();
	}
	
	
	@Override
	public String doSearch(String userId, String searchType) {
		if(checkAccess(userId)){
			String result = searcher.doSearch(null, searchType);
			logUsage(userId);
			return result;
		}else{
			return null;
		}
	}
	
	private boolean checkAccess(String userId){
		accessValidator =new AccessValidator();
		return 	accessValidator.validateUser(userId);
	}
	
	private void  logUsage(String userId){
		UsageLogger logger = new UsageLogger();
		logger.setUserId(userId);
		logger.save();
	}

}
