package practical02;

// Abstract Class
abstract class Student {

    String name = "Anchal Yadav";
    String course = "B.Sc CS";
    String semester = "3rd Semester";

    abstract void study();

    void display() {
        System.out.println("===== STUDENT DETAILS =====");
        System.out.println("Name      : " + name);
        System.out.println("Course    : " + course);
        System.out.println("Semester  : " + semester);
    }
}

// Child Class
class CollegeStudent extends Student {

    @Override
    void study() {
        System.out.println("Subject   : Java Programming");
        System.out.println("Topic     : Abstract Class and Abstract Method");
        System.out.println("Status    : Successfully Executed");
    }
}

// Main Class
public class AbstractClass {

    public static void main(String[] args) {

        CollegeStudent student = new CollegeStudent();

        student.display();
        student.study();

    }

}