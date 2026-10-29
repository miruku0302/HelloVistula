package animals;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        species = "Unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColour, String species) {
        super(name, age, weight, featherColour);
        this.species = species;
    }

    public Pigeon(String name, int age, String featherColour, String species) {
        super(name, age, featherColour);
        this.species = species;
    }

    public void carryMessage() {
        System.out.println(getName() + " carries a message.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats crumbs.");
    }

    @Override
    public String getVoice() {
        return "Coo-coo!";
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() {
        return super.toString() + ", species=" + species;
    }
}
