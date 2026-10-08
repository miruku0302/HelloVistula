public class MarsWeight {
    //All variables are declared below at the top of the class.
    static float earthWeightNoraika = 80f;
    static float marsGravityRatioNoraika = 0.38f;
    static float marsWeightFloatNoraika;
    static double marsWeightDoubleNoraika;
    static int marsWeightIntNoraika;
    static char marsWeightCharNoraika;
    static int charMathResultNoraika;

    public static void main(String[] args) {

        //Prints out my own weight on Earth in KG along with the gravity ratio for Mars.
        System.out.println("Earth weight (float): " + earthWeightNoraika + " kg");
        System.out.println("Mars gravity ratio (float): " + marsGravityRatioNoraika);

        //Calculate my weight on Mars in float variable and print it.
        marsWeightFloatNoraika = earthWeightNoraika * marsGravityRatioNoraika;
        System.out.println("Calculated Mars weight (float): " + marsWeightFloatNoraika + " kg");

        //Assign the float to the double variable.
        marsWeightDoubleNoraika = marsWeightFloatNoraika;
        System.out.printf("Assigned to double, shown with 4 decimal places: %.4f kg%n", marsWeightDoubleNoraika);

        //Cast the double into int.
        marsWeightIntNoraika = (int) marsWeightDoubleNoraika;
        System.out.println("Cast double to int (decimals cut off): " + marsWeightIntNoraika);

        //Cast the int into char.
        marsWeightCharNoraika = (char) marsWeightIntNoraika;
        System.out.println("Cast int to char, character code: " + (int) marsWeightCharNoraika);

        //Math operation on the char, stored in a new int.
        charMathResultNoraika = marsWeightCharNoraika + 10;
        System.out.println("Char code + 10, stored in a new int: " + charMathResultNoraika);
    }

}





