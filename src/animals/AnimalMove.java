package animals;

public interface AnimalMove {
    default void move() {
        System.out.println(getClass().getSimpleName() + " moves, like any animal.");
    }
}
