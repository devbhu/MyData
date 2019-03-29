package java8.lamda;

import com.sun.corba.se.spi.logging.LogWrapperFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

abstract class t {
    public void m(){
        System.out.println("dev");
    }
        }

class Emp {
    int empId;
    String name;

    public Emp(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }
}

public class SortEmpWithLamda {
    private final static Logger LOGGER = Logger.getLogger(SortEmpWithLamda.class.getName());
    public static void main(String a[]){

        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp(2,"sonu"));
        empList.add(new Emp(3,"baby"));
        empList.add(new Emp(4,"monu"));
        empList.add(new Emp(5,"pooja"));
        empList.add(new Emp(6,"nisha"));
        LOGGER.info("Employee list before sorting "+empList);
        Comparator<Emp> empComparator = (i, j) -> i.empId < j.empId ? -1 :(i.empId > j.empId ? 1 : 0);
        Collections.sort(empList, empComparator);
        LOGGER.info("Sorting based on id {} "+empList);

        Comparator<Emp> empComparator1 = (i, j) -> i.name.compareTo(j.name);
        Collections.sort(empList, empComparator1);
        LOGGER.info("Sorting based on name {} "+empList);
    }
}
