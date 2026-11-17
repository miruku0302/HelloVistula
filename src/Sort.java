import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int counter = 0;

        System.out.println("Before:");
        System.out.println(Arrays.toString(array));

        boolean toSort = true;
        for (int i = 1; i < array.length && toSort; i++) {
            toSort = false;
            counter++;
            for (int j = 0; j < array.length - i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    counter++;
                    int greater = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = greater;
                    toSort = true;
                }
            }
            System.out.println(Arrays.toString(array));
        }

        System.out.println("After:");
        System.out.println(Arrays.toString(array));
        System.out.println("Number of actions: " + counter);
    }
}