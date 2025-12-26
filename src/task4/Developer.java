package task4;

public class Developer extends Employee {
    public String name;

    int experience;


    private double salary;

    @Override
    void work(){
        System.out.println("Developer is coding");
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }
}
