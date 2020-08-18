package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Customer{
    String name;
    String deparment;

    public Customer(String name, String deparment) {
        this.name = name;
        this.deparment = deparment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
}
public class StreamDemo {
    public static void main(String arg[]){
        List<Customer> customers=new ArrayList<>();
        customers.add(new Customer("devmani","finance"));
        customers.add(new Customer("sonu","finance"));
        customers.add(new Customer("puttu","finance"));
        customers.add(new Customer("shailaja","telecom"));
        customers.add(new Customer("monu","telecom"));
        Map<String, Set<String>> cus=customers.stream().collect(Collectors.groupingBy(Customer::getDeparment,
                Collectors.mapping(Customer::getName, Collectors.toSet())));
        System.out.println(cus);
        cus.entrySet().forEach(e-> System.out.println(e.getKey()+", "+e.getValue()));

    }
}
