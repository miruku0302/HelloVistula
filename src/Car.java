public class Car {

    private String model;
    private String brand;
    private String colour;
    private int year;
    private int quantity;
    private double price;


    public Car(String model, String brand, String colour, int year, int quantity, double price){
        this.model = model;
        this.brand = brand;
        this.colour = colour;
        this.year = year;
        this.quantity = quantity;
        this.price = price;
    }


    public String getModel(){
        return model;
    }

    public String getBrand(){
        return brand;
    }

    public String getColour(){
        return colour;
    }

    public int getYear(){
        return year;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }


    public void setModel(String model){
        this.model = model;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }


    public void delivery(){
        quantity++;
    }

    public void sell(){
        if (quantity > 0){
            quantity--;
        }
        else{
            System.out.println("No cars left to sell.");
        }
    }


    @Override
    public String toString(){
        return "Car{model=" + model
                + ", brand=" + brand
                + ", colour=" + colour
                + ", year=" + year
                + ", quantity=" + quantity
                + ", price=" + price + "}";

    }
}

