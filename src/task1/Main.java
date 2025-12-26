package task1;

public class Main {
    public static void main(String[] args) {
        Student student =  new Student();

        student.name = "Nona";
        student.age=28;
        student.courseName = "Java Programming";

        student.printInfo();
        student.printStudentInfo();
    }
}
