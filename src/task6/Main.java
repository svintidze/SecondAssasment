package task6;

public class Main {
    public static void main(String[] args) {
        ArrayPrinter  printer = new ArrayPrinter();

        int[] numbers = {10,20,30,40};
        String[] words = {"Java", "Overloading", "Example"};

        printer.printArray(numbers);
        printer.printArray(words);
    }
}
