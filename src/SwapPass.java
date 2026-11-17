import java.util.Arrays;

public class SwapPass{
    public static void main(String[] args){
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Before:");
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }

        System.out.println("After:");
        System.out.println(Arrays.toString(numbers));
    }
}

