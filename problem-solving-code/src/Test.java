import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

class Entity {
    final long id;
    final String data;

    public long getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    Entity(long id, String data) {
        this.id = id;
        this.data = data;
    }
}

class P<u, v>{
    u first;
    v last;
    P(u first, v last){
        this.first=first;
        this.last=last;
    }
    public static <u,v> P<u,v> of(u U, v V){
        return new P(U,V);

    }
}
public class Test {
    public static void main(String a[]){
      /* List<String> stringList = new ArrayList<>();
       stringList.add("");
       stringList.add("sonu");
        System.out.println(stringList.get(0).isEmpty());*/
        try{
            List l =new ArrayList();
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            ae.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("outer");
       /* String time = "13:10";

        DateFormat sdf = new SimpleDateFormat("HH:mm"); // or "hh:mm" for 12 hour format
        Date date = null;
        try {
            date = sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        date.getHours(); // int
        date.getMinutes(); // int*/
    }
}
