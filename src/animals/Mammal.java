package animals;

public class Mammal extends Animal {
    private String furColour;

    public Mammal() {
        furColour = "Unknown";
    }

    public Mammal(String name, int age, double weight, String furColour) {
        super(name, age, weight);
        this.furColour = furColour;
    }

    public Mammal(String name, int age, String furColour){
        super(name, age);
        this.furColour = furColour;
    }

    public void feedYoung(){
        System.out.println(getName() + " feeds its young using milk.");
    }


    @Override
    public void eat() {
        System.out.println(getName() + " eats.");
    }

    @Override
    public String getVoice(){
        return "Mammal sound.";
    }

    public String getFurColour(){return furColour;}
    public void setFurColour(String furColour){this.furColour = furColour;}

    @Override
    public String toString(){
        return super.toString() + ", furColour=" + furColour;
    }
}

