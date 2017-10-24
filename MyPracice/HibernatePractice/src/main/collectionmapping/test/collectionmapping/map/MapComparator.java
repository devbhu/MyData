package test.collectionmapping.map;

import java.util.Comparator;

public class MapComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof UserName && o2 instanceof UserName){
			
			UserName u1= (UserName)o1;
			UserName u2= (UserName)o2;
			
			return u1.getUserName().compareTo(u2.getUserName());
			
		}
		
		return 0;
	}

}
