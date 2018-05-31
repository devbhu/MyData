package temp;

public class StringAbbreviation
{

	public static void main(String[] args)
	{
		String st = "  raj  Kumar Singh ss df dfbbj rfiounkdv jsdbfio   ";
		st=st.trim();
		int b=st.lastIndexOf(' ');
		String temp = st.substring(b+1);
	   //  System.out.println(temp);
	    // System.out.println(b);
	     System.out.print(Character.toString(st.charAt(0)).toUpperCase()+".");
		for(int i=1;i<st.length();i++){
			if(i<b && (st.charAt(i)==' ' && st.charAt(i+1)!=' ')){
		System.out.print(Character.toString(st.charAt(i+1)).toUpperCase()+".");
			}
	}
		System.out.print(temp);
	}
}
