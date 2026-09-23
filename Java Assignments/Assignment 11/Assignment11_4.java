public class Calculator {
    interface MathOperation {
        double operate(double a, double b);
    }

    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;
        double x = 10.0;
        double y = 2.0;
        System.out.println("Addition: " + add.operate(x, y));
        System.out.println("Subtraction: " + subtract.operate(x, y));
        System.out.println("Multiplication: " + multiply.operate(x, y));
        System.out.println("Division: " + divide.operate(x, y));
    }
}