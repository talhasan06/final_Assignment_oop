import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    String name;
    int age;
    double cgpa;
    Student(String name,int age,double cgpa){
        this.name=name;
        this.age=age;
        this.cgpa=cgpa;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.name.equals(other.name);
        }
        return false;
    }
}
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student>alist=new ArrayList<>();
        alist.add(new Student("Sonet",15,3.8));
        alist.add(new Student("Zhang",17,3.9));
        alist.add(new Student("Buffon",20,3.6));
        Student query=new Student("Zhang",20,3.6);
        boolean found = false;

        for (Student student : alist) {
            if (student.equals(query)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Query student found in the collection.");
        } else {
            System.out.println("Query student not found in the collection.");
        }

        Collections.sort(alist, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.age>s2.age){
                    return -1;
                }
                return 0;
            }
        });
    }
}
