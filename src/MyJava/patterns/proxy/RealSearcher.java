package MyJava.patterns.proxy;

public class RealSearcher implements Searcher {

	public RealSearcher(){
		
	}
	@Override
	public String doSearch(String userId, String searchType) {
		return "resultSet";
	}

}
