public class CarMain {

    public static void main(String[] args) {
        Car car = new Car("Corolla", "Toyota", "Blue", 2022, 5, 85000.0);

        System.out.println("Created car: " + car.toString());

        car.sell();

        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Colour: " + car.getColour());
        System.out.println("Year: " + car.getYear());
        System.out.println("Quantity: " + car.getQuantity());
        System.out.println("Price: " + car.getPrice());

        car.setColour("Red");
        car.setPrice(79000.0);

        System.out.println("After set methods: " + car.toString());
    }
}
