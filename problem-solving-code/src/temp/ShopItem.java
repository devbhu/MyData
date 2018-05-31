package temp;

import java.io.IOException;
import java.util.Scanner;

class Item{
	String name;
	int price;
	int count;
	Item(String name,int price,int count){
		this.name=name;
		this.price=price;
		this.count=count;
	}
}
public class ShopItem
{

	/**
	 * @param args
	 */
	public static void addItem(Item i[],String Name){
	for(Item i1 :i){
		if(i1.name.equals(Name))
			i1.count++;
	}
	}
	
	public static void subItem(Item i[],String Name){
		for(Item i1 :i){
			if(i1.name.equals(Name))
				i1.count--;
		}
		}
	
	public static void queryItem(Item i[],int value){
		int temp=0;
		for(Item i1 :i){
			if(i1.price>value){
				temp+=i1.count;
			}
		}
		System.out.println("Total no of product which price is greater than  "+value+"   are: "+temp);
		}
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		//int l[]=new int[];
		Item it[]=new Item[3];
		Scanner sc=new Scanner(System.in);
		Item i1=new Item("apple",10,40);
		Item i2=new Item("orange",7,11);
		Item i3=new Item("pineapple",15,14);
		it[0]=i1;
		
		
		it[1]=i2;
		
		it[2]=i3;
		/*System.out.println("enter Items");
		for(int i=0;i<3;i++)
		{
			String str=sc.next();
			int p=sc.nextInt();
			//int c=sc.nextInt();
			Item item=new Item(str,p,0);
			it[i]=item;
		}*/
		
		for(Item i : it){
			System.out.println(i.name+" , "+i.price+" , "+i.count);
		}
		
		/*System.out.println("enter name of product to add");
		String s=sc.next();
		ShopItem.addItem(it,s);
		System.out.println("enter name of product to sub");
		String s1=sc.next();
		ShopItem.subItem(it,s1);*/
		//sc.close();
		System.out.println("enter value ");
		int val =sc.nextInt();
		ShopItem.queryItem(it, 7);
		for(Item i : it){
			System.out.println(i.name+" , "+i.price+" , "+i.count);
		}

	}

}
