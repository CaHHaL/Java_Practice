class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int compareTo(Student other) {
        return this.rollNo - other.rollNo;
    }

    public String toString() {
        return rollNo + " - " + name;
    }
}

public class Main {
    public static void main(String args[]){
        list<Student> list = new Arraylist<>();
        list.add(new Student(102,'abc'));
        list.add(new Student(103,'abcd'));
        list.add(new Student(104,'abcde'));
        Collections.sort(list);
        for(Student s:list){
            System.out.println(s);
        }
    }
}

// util.lang
