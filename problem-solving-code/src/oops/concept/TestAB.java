package oops.concept;


import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

class Age {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

final class ImmutableStudent {
    private final int id;
    private final String name;
    private final Age age;

    public ImmutableStudent(int id, String name, Age age) {
        this.name = name;
        this.id = id;
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }
}

public class TestAB {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, 3);
        String largest = s.substring(0, 3);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        int i = 0;
        int j = k;
        while (i < (s.length() - k + 1)) {
            String t = s.substring(i, j);
            if (smallest.compareTo(t) > 0) {
                smallest = t;
            }
            if (largest.compareTo(t) < 0) {
                largest = t;
            }

            i++;
            j = i + k;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String args[]) {
        final Map<Integer, Integer> wordCounts = new HashMap<>();
        wordCounts.put(3, 100);
        wordCounts.put(1, 200);
        wordCounts.put(10, 50);
        wordCounts.put(14, 70);
        wordCounts.put(4, 200);

        final Set<Integer> sortedByCount = wordCounts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new))
                .keySet();

        System.out.println(sortedByCount);
    }
}

