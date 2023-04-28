import java.util.ArrayList;

class Student{
    String name;
    int id;
    double cgpa;
    Student(String name,int id,double cgpa){
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }
    Student(String name){
        this.name=name;
        this.id=-1;
        this.cgpa=-1;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        list.add(new Student("Wizard",3,3.88));
        list.add(new Student("Peter",2,3.5));
        list.add(new Student("Manda",1,3.88));
        list.add(new Student("Thanos",41,3.9));
        list.add(new Student("Yelena",7,3.75));
        list.add(new Student("Thor",15,3.89));

        Student searchStudent = new Student("Manda", 1,3.88);
        if (list.contains(searchStudent)) {
            System.out.println("The list contains the searchStudent object.");
        } else {
            System.out.println("The list does not contain the searchStudent object.");
        }

    }
}