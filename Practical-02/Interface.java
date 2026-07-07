package practical02;

// Interface
interface MathOperations {

    double add(double a, double b);

    double subtract(double a, double b);

    double multiply(double a, double b);

    double divide(double a, double b);

}

// Implementation Class
class Calculator implements MathOperations {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {

        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }

        return a / b;
    }

}

// Main Class
public class Interface {

    public static void main(String[] args) {

        MathOperations calculator = new Calculator();

        System.out.println("===== CALCULATOR USING INTERFACE =====");
        System.out.println("Addition       : " + calculator.add(20, 10));
        System.out.println("Subtraction    : " + calculator.subtract(20, 10));
        System.out.println("Multiplication : " + calculator.multiply(20, 10));
        System.out.println("Division       : " + calculator.divide(20, 10));

    }

}