import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


interface A{
    int sum();
    default void m(){
        System.out.println("dev");
    }
}
interface B{
    default void m(){
        System.out.println("dev");
    }
}
class C implements A, B{
    public C(){
        this.m();
    }

    public void t(){

    }

    @Override
    public int sum() {
        return 0;
    }

    @Override
    public void m() {
        System.out.println("class C");
    }
}

class Employee {
    final long id;
    final String data;
    String country;

    public Employee(long id, String data, String country) {
        this.id = id;
        this.data = data;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

class Aa implements Predicate {

    @Override
    public boolean test(Object o) {
        return true;
    }
}

class MyCon implements Consumer<Employee> {

    @Override
    public void accept(Employee e) {
        System.out.println(e.id + ", " + e.data);
    }
}

class MyPredicate implements Predicate<Employee> {

    @Override
    public boolean test(Employee integer) {
        return integer.id > 30;
    }
}

public class Test {
    private void display() {
        System.out.println("dev");
    }

    private void m() {
        new Thread(this::display).start();
    }

    static void Example3rdConstructor() {
        // Creating a Map
        Map<Integer, String> hash_map
                = new HashMap<Integer, String>();

        // Mapping string values to int keys
        hash_map.put(100, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        // Creating the TreeMap using the Map
        TreeMap<Integer, String> tree_map
                = new TreeMap<Integer, String>(hash_map);

        // Displaying the TreeMap
        System.out.println("TreeMap: "
                + tree_map);
    }


    public static void main(String a[]) {
        Hashtable hs = new Hashtable();
        hs.put("dec","dev");
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(34, "sekh","india"));
        employees.add(new Employee(30, "hjgdsj","india"));
        employees.add(new Employee(335, "jku","india"));
        employees.add(new Employee(1, "ugiu","china"));
        //employees.stream().filter(new MyPredicate()).forEach(new MyCon());
        //  employees.forEach(new MyCon());
        employees.stream().filter(e->e.id%2==0).forEach(System.out::println);

        Comparator<Employee> comparator = Comparator.comparing(Employee::getData);
        Collections.sort(employees, comparator);
        for (int i = 0; i < employees.size(); i++) {
            // System.out.println(employees.get(i).id+"  "+employees.get(i).data);
        }
        Random random = new Random();
       // System.out.println(new Aa().test(null));
        Test test = new Test();
        test.m();
      //  Example3rdConstructor();
        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getCountry));
       // System.out.println(collect);
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
        try {
            Files.lines(Paths.get("C:\\Users\\devsingh3\\project\\MyData\\problem-solving-code\\src\\manifest.mf")).filter(s->s.contains("Dev")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
