package test.sort.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortHashMap {

	private static final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	static {
		map.put(1, 890);
		map.put(4, 445);
		map.put(2, 32);
		map.put(3, 21);
		map.put(6, 22);
	}

	public static void main(String[] args) {
		//sortHashMapByValues(map);
		System.out.println(sortHashMapByValues(map));
	}

	private static Map<Integer,Integer> sortHashMapByValues(Map<Integer, Integer> inputMap) {
		List<EntryKeyValue> list = new ArrayList<>();
		Map<Integer,Integer> sortedMap = new LinkedHashMap<>();
		Set entrySetVals = inputMap.entrySet();
		for(Object e : entrySetVals) {
			Map.Entry ent = (Map.Entry)e;
			list.add(new EntryKeyValue((Integer)ent.getKey(), (Integer)ent.getValue()));
		}
		Collections.sort(list, new Comparator<EntryKeyValue>() {

			@Override
			public int compare(EntryKeyValue e1, EntryKeyValue e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		});
		
		for(EntryKeyValue e : list) {
			sortedMap.put(e.getKey(), e.getValue());	
		}
		
		return sortedMap;
	}

}
