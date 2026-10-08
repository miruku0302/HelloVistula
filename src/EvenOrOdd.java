public class EvenOrOdd {

    public static void main(String[] args) {
        //Generate a random number from 1 to 100.
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Generated a random number between 1 and 100: " + randomNumber);

        //Modulo gives the remainder after dividing by 2.
        int remainder = randomNumber % 2;
        System.out.println("Remainder of " + randomNumber + " divided by 2 (modulo): " + remainder);

        //Remainder 0 means even, 1 means odd.
        if (remainder == 0) {
            System.out.println("Remainder is 0, so " + randomNumber + " is an EVEN number.");
        } else {
            System.out.println("Remainder is 1, so " + randomNumber + " is an ODD number.");
        }
    }
}
