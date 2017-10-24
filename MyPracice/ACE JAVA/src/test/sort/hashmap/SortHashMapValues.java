import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.*;
import java.util.Map.Entry;

public class SortHashMapValues {

	private static final Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	static {
		map.put(1, 890);
		map.put(4, 445);
		map.put(2, 32);
		map.put(3, 21);
		map.put(6, 22);
	}

	public static void main(String []args){
        
    Map<Integer,Integer>sortedMap =  map.entrySet().stream()
    .sorted(Map.Entry.comparingByValue((v1,v2)->v2.compareTo(v1)))
    .collect(Collectors.toMap(Entry::getKey, Entry::getValue,(v1,v2)->v1, LinkedHashMap::new));
    
    System.out.println(sortedMap);     
         
     }
}