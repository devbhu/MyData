package miscellaneous.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapGetKeyByValue
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		Set<Integer> hs =new HashSet<Integer>();
		m.put(1, "dev");
		m.put(2, "sonu");
		m.put(3, "monu");
		m.put(5, "monu");
		m.put(6, "monu");
		m.put(4, "ram");
		for(Entry<Integer,String> entry : m.entrySet()){
			if(entry.getValue().equals("monu"))
			System.out.println(entry.getKey());
		}
		
		

	}

}
