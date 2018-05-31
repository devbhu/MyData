package miscellaneous.questions;

public class PowerOfX {
	int power(int x,int y ,int c){
		int tmp=1;
		if(y==0)
			return 1;
		else if(y==1)
			return x;
		tmp=power(x,y/2,c);
		if(y%2==0)
			return (tmp*tmp)%c;
		else
			return (x*tmp*tmp)%c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerOfX obj=new PowerOfX ();
		System.out.println(obj.power(3,4,5));
	}

}
