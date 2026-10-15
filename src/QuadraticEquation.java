import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of A (and press enter): ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of B (and press enter): ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of C (and press enter): ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("A cannot be 0");
            return;
        }

        double delta = b * b - 4 * a * c;

        int roots;
        if (delta > 0) {
            roots = 2;
        } else if (delta == 0) {
            roots = 1;
        } else {
            roots = 0;
        }

        System.out.printf("a = %.2f, b = %.2f, c = %.2f%n", a, b, c);
        System.out.printf("delta = %.2f%n", delta);

        double x1;
        double x2;

        switch (roots) {
            case 2:
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("x1 = %.2f%n", x1);
                System.out.printf("x2 = %.2f%n", x2);
                break;
            case 1:
                x1 = -b / (2 * a);
                System.out.printf("x1 = %.2f%n", x1);
                break;
            default:
                System.out.println("No roots.");
        }


    }
}

