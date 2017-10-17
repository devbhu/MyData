package javaconcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class employee{
	int id ;
	String name;
	float sal;
	employee(){
		
	}
	employee(int id1,String name1 , float sal1){
		
		id=id1;
		name=name1;
		sal=sal1;
		
	}
}
public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Set s= new HashSet();
		employee e1 = new employee(1,"devm",232212) ;
		employee e2 = new employee(1,"devm",232212) ;
		s.add("dev");
		s.add("354");
		Iterator i = s.iterator();
		while(i.hasNext())
		System.out.println(i.next());
	}

}
