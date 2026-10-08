public class LegoContainers {

    public static void main(String[] args) {
        //Odd number between 50 and 100.
        int amountOfBricks = 77;
        //Even number between 5 and 10.
        int containerCapacity = 8;

        System.out.println("Total number of Lego bricks: " + amountOfBricks);
        System.out.println("Bricks that fit in one container: " + containerCapacity);

        //Integer division gives the number of completely full containers.
        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Full containers (" + amountOfBricks + " / " + containerCapacity + "): " + fullContainers);

        //Modulo gives the bricks left over after filling the full containers.
        int bricksInLastContainer = amountOfBricks % containerCapacity;
        System.out.println("Bricks in the non-completely full container (" + amountOfBricks + " % " + containerCapacity + "): " + bricksInLastContainer);

        //One extra container is needed if any bricks are left over.
        int allContainers = fullContainers;
        if (bricksInLastContainer > 0) {
            allContainers = fullContainers + 1;
        }
        System.out.println("All containers needed (full and not full): " + allContainers);
    }
}
