package animals;

public class Bird extends Animal {
    private String featherColour;

    public Bird() {
        featherColour = "Unknown";
    }

    public Bird(String name, int age, double weight, String featherColour) {
        super(name, age, weight);
        this.featherColour = featherColour;
    }

    public Bird(String name, int age, String featherColour) {
        super(name, age);
        this.featherColour = featherColour;
    }

    public void fly() {
        System.out.println(getName() + " flies.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats seeds.");
    }

    @Override
    public String getVoice() {
        return "Tweet!";
    }

    public String getFeatherColor() { return featherColour; }
    public void setFeatherColor(String featherColor) { this.featherColour = featherColor; }

    @Override
    public String toString() {
        return super.toString() + ", featherColour=" + featherColour;
    }
}
