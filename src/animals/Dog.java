package animals;

public class Dog extends Mammal {
    private String breed;

    public Dog() {
        breed = "Unknown";
    }

    public Dog(String name, int age, double weight, String furColour, String breed) {
        super(name, age, weight, furColour);
        this.breed = breed;
    }

    public Dog(String name, int age, String furColour, String breed) {
        super(name, age, furColour);
        this.breed = breed;
    }

    public void fetch() {
        System.out.println(getName() + " fetches the ball.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats meat.");
    }

    @Override
    public String getVoice() {
        return "Woof!";
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        return super.toString() + ", breed=" + breed;
    }
}
