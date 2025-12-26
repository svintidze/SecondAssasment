package task4;

public class Main {
    public static void main(String[] args) {
        Developer developer=new Developer();

        developer.name="Giorgi";
        developer.experience=4;
        developer.setSalary(7800);
        developer.showRole();
        developer.work();
        System.out.println("Salary" + developer.getSalary()) ;
    }
}
