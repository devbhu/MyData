package miscellaneous.questions;

public class Print1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String set = new java.util.BitSet() {{ set(1, 100+1); }}.toString();
	        System.out.append(set, 1, set.length()-1);

	}

}