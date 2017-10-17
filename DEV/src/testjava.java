import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;


public class testjava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList a = new ArrayList<Integer>();
		 ListIterator<Integer> it = null;
		for(int i=1;i<=100;i++){
			a.add(i);
			
		}
		
		it= a.listIterator();
		
		while(it.hasNext()){
			a.add(101);
			System.out.print(it.next()+",");
		}
		
		System.out.println();
		
		it= a.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
		System.out.println();
		it= a.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
		System.out.println();
		it= a.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
		System.out.println();
		it= a.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}

	}

}
