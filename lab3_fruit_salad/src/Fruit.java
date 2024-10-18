abstract class Fruit {
    private double weight;         // in grams
    private double sugarContent;   // in percentage
    private double waterContent;   // in percentage
    private FruitColor color;

    public Fruit(double weight, double sugarContent, double waterContent, FruitColor color) {
        this.weight = weight;
        this.sugarContent = sugarContent;
        this.waterContent = waterContent;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public double getWaterContent() {
        return waterContent;
    }

    public FruitColor getColor() {
        return color;
    }

    public abstract void printFruitDetails();
}

enum FruitColor {
    RED, YELLOW, PURPLE, GREEN, ORANGE
}
