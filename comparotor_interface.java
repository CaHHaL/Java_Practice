import java.util.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return rollNo + " - " + name;
    }
}

// Comparator to sort by name
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // ascending order
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(102, "abc"));
        list.add(new Student(101, "xyz"));
        list.add(new Student(103, "pqr"));

        Collections.sort(list, new NameComparator()); // Sort using custom comparator

        for (Student s : list)
            System.out.println(s);
    }
}

// java.util
// compare(T o1,T o2)
// in a separate class or lambda