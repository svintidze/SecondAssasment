package task5;

public class Multitask implements First, Second, Third {
    @Override
    public void firstMethod() {
        System.out.println("First Method");
    }
    @Override
    public void secondMethod() {
        System.out.println("Second Method");
    }
    @Override
    public void thirdMethod() {
        System.out.println("Third Method");
    }
}
