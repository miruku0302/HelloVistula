import java.util.Random;

public class MinMax {

    public static void main(String[] args) {
        int i = 1;
        int collectionSize = 10;
        int number;
        int max = 0;
        int min = 101;

        Random r = new Random();

        while (i <= collectionSize) {
            number = r.nextInt(100) + 1;
            System.out.print(number + ", ");

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            i++;
        }

        System.out.println("");
        System.out.println("The largest number in this collection is: " + max);
        System.out.println("The smallest number in this set is: " + min);
    }
}