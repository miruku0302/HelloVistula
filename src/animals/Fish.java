package animals;

public class Fish extends Animal {
    private String waterType;

    public Fish() {
        waterType = "Unknown";
    }

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, int age, String waterType) {
        super(name, age);
        this.waterType = waterType;
    }

    public void swim() {
        System.out.println(getName() + " swims.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats plankton.");
    }

    @Override
    public String getVoice() {
        return "glug!";
    }

    public String getWaterType() { return waterType; }
    public void setWaterType(String waterType) { this.waterType = waterType; }

    @Override
    public String toString() {
        return super.toString() + ", waterType=" + waterType;
    }
}
