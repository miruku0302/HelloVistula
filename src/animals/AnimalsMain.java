package animals;

public class AnimalsMain {

    public static void main(String[] args) {
        // array of Animal references, objects made with different constructors
        Animal[] animals = new Animal[6];
        animals[0] = new Mammal("Lion", 6, 190.0, "Golden");
        animals[1] = new Bird("Parrot", 3, "Green");
        animals[2] = new Fish();
        animals[3] = new Dog("Dolly", 4, 22.5, "Brown", "French Bulldog");
        animals[4] = new Pigeon("Coo", 2, "Grey", "Rock pigeon");
        animals[5] = new Blowfish();

        // print each object using toString()
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        // call selected methods on individual indexes
        animals[3].eat();
        System.out.println(animals[3].getVoice());
        animals[4].eat();
        System.out.println(animals[4].getVoice());
        animals[5].eat();
        System.out.println(animals[5].getVoice());

        // change a field with a set method and print again
        animals[3].setName("Chiplet");
        System.out.println(animals[3]);
    }
}
