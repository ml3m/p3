public class FruitPreparation {
    public static void prepareFruit(Fruit[] fruits) {
        for (Fruit fruit : fruits) {
            // check for type
            if (fruit instanceof Peelable) {
                Peelable peelableFruit = (Peelable) fruit;
                if (peelableFruit.hasPeel()) {
                    peelableFruit.peelOff();
                } else {
                    System.out.println(fruit.getClass().getSimpleName() + " is already peeled.");
                }
            }

            if (fruit instanceof SeedRemovable) {
                SeedRemovable seedRemovableFruit = (SeedRemovable) fruit;
                if (seedRemovableFruit.hasSeeds()) {
                    seedRemovableFruit.removeSeeds();
                } else {
                    System.out.println(fruit.getClass().getSimpleName() + " already has its seeds removed.");
                }
            }
        }
    }
}