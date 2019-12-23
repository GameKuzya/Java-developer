
public class Cat {
    public static final int LEGS_COUNT = 4;
    public static final int EYES_COUNT = 2;
    public static final int MIN_WIGHT = 1000;
    public static final int MAX_WEIGHT = 9000;

    public void setCatColour(CatColour type) {

    }

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private static int count;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    public void meow(Double weight) {
        if (isAlive())

            this.weight = this.weight - weight;
        System.out.println("Meow");
    }


    public void feed(Double weight) {
        if (isAlive())
            this.weight = this.weight + weight;
        System.out.println("Кошка съела: " + weight + " грамм вискаса");
    }

    public double verni(double weight) {
        this.weight = this.weight - weight;
        System.out.println("Кошка вернула: " + weight + " грамм вискаса");
        return weight;
    }

    public double toilet() {
        weight = weight - 100.0;
        System.out.println("Кошка сходила в туалет");
        return weight;

    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public static int getCount() {
        return count;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {

        if (weight < minWeight) {
            count--;
            return "Dead";
        } else if (weight > maxWeight) {
            count--;
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}