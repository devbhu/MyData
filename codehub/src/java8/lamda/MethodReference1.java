package java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java8.lamda.MethodReference1.printConditional;

class Person{
    int id;
    String name ;
    double sal;

    public Person() {
    }

    public Person(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    public  String toString(){
        return "id = "+id+"name = "+name+"sal = "+sal;
    }
}

public class MethodReference1 {
    public static void main(String a[]){
        List<Person> list = Arrays.asList(
                new Person(1,"Amit",23),
                new Person(2,"Arindam",5000),
                new Person(3,"dev",3543234)
        );

        printConditional(list,p->true,p->System.out.println(p));
    }

    static void printConditional(List<Person> l, Predicate<Person> p, Consumer<Person> person){
        for(Person per : l){
            if(p.test(per)){
                person.accept(per);
            }
        }
    }
}
