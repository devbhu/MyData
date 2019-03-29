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
public class Test {
    public static void main(String a[]){
        String time = "13:10";

        DateFormat sdf = new SimpleDateFormat("HH:mm"); // or "hh:mm" for 12 hour format
        Date date = null;
        try {
            date = sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        date.getHours(); // int
        date.getMinutes(); // int
    }
}
