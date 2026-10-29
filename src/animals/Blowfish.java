package animals;

public class Blowfish extends Fish {
    private String skinPattern;

    public Blowfish() {
        skinPattern = "Unknown";
    }

    public Blowfish(String name, int age, double weight, String waterType, String skinPattern) {
        super(name, age, weight, waterType);
        this.skinPattern = skinPattern;
    }

    public Blowfish(String name, int age, String waterType, String skinPattern) {
        super(name, age, waterType);
        this.skinPattern = skinPattern;
    }

    public void inflate() {
        System.out.println(getName() + " inflates like a balloon.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats shellfish.");
    }

    @Override
    public String getVoice() {
        return "Blub!";
    }

    public String getSkinPattern() { return skinPattern; }
    public void setSkinPattern(String skinPattern) { this.skinPattern = skinPattern; }

    @Override
    public String toString() {
        return super.toString() + ", skinPattern=" + skinPattern;
    }
}
