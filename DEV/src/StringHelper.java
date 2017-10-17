
public class StringHelper {

	/**
	 * @param args
	 */
	public String truncateaInFirst2Position(String str){
		if(str.length()==0)
			return str;
		if(str.length()<2)
			return str.replaceAll("A","");
		String first2Chars=str.substring(0,2);
		String afterFirst2Chars=str.substring(2); 
		return  first2Chars.replaceAll("A","") + afterFirst2Chars;
		
	}
}
