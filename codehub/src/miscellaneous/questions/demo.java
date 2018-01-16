package miscellaneous.questions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

class demo
{
    String str = "a";
 
    void A()
    {
        try
        {
            str +="b";
            B();
        }
        catch (Exception e)
        {
            str += "c";
        }
    }
 
    void B() throws Exception
    {
        try
        {
            str += "d";
            C();
        }
        catch(Exception e)
        {
            throw new Exception();
        }
        finally
        {
            str += "e";
        }
 
        str += "f";
 
    }
     
    void C() throws Exception
    {
        throw new Exception();
    }
 
    void display()
    {
        System.out.println(str);
    }
 
    public static void main(String[] args) 
    {
    	CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    	Set s = new TreeSet();
    	s.add("sdf");
    	s.add(null);   
    	
    	i.add(null);
        demo object = new demo();
        object.A();
        object.display();
     //   throw new Error();
    }
 
}