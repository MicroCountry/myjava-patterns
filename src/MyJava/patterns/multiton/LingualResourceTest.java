package MyJava.patterns.multiton;

public class LingualResourceTest {
	public static void main(String[] args) {
		LingualResource ling = LingualResource.getInstance("en", "US");
		String usDollar = ling.getLocaleString("USD");
		System.out.println("USD="+usDollar);
		
		LingualResource lingzh = LingualResource.getInstance("zh", "CH");
		String usDollarzh = lingzh.getLocaleString("USD");
		System.out.println("USD="+usDollarzh);
	}
}
