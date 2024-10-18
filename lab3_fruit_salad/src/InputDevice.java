public class InputDevice {

    public static Fruit[] readFruit() {
        Fruit[] fruits = new Fruit[2];

        // Create a Banana object
        fruits[0] = new Banana(120.5, 14.3, 75.0);
        fruits[1] = new Apple(180.0, 10.5, 85.0, FruitColor.RED);

        return fruits;
    }
}