package animals;

public class AnimalsMain {

    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Mammal("Lion", 6, 190.0, "Golden");
        animals[1] = new Bird("Parrot", 3, "Green");
        animals[2] = new Fish();
        animals[3] = new Dog("Dolly", 4, 22.5, "Brown", "French Bulldog");
        animals[4] = new Pigeon("Coo", 2, "Grey", "Rock pigeon");
        animals[5] = new Blowfish();

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        animals[3].eat();
        System.out.println(animals[3].getVoice());
        animals[4].eat();
        System.out.println(animals[4].getVoice());
        animals[5].eat();
        System.out.println(animals[5].getVoice());

        animals[3].setName("Chiplet");
        System.out.println(animals[3]);

        AnimalBehavior[] behaviors = new AnimalBehavior[3];
        behaviors[0] = new Dog("Rex", 4, "Brown", "Labrador");
        behaviors[1] = new Pigeon("Coo", 2, "Grey", "Rock pigeon");
        behaviors[2] = new Blowfish("Puff", 1, "Salt water", "Spotted");

        behaviors[0].sleep();
        behaviors[1].sleep();
        behaviors[2].sleep();

        for (Animal animal : animals) {
            animal.move();
        }

        for (Animal animal : animals) {
            AnimalName.name(animal.getName());
        }
    }
}
