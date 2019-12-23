
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
    private double feed;
    private boolean alive;

    private static int catCount = 0;

    public static int getCatCount() {
        System.out.printf("Всего кошек: ");
        return catCount;
    }

    public Cat(double weight) {
        this.weight = weight;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        alive = true;
        catCount++;
    }

    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public void meow() {
        do {
            weight = weight - 1;
        } while (weight > minWeight);
        System.out.println("Meow");
    }


    public void feed(Double amount) {
        weight = weight + amount;
    }

    public String getFeed() {
        feed = weight - originWeight;
        return "Кошка съела: " + feed + " грамм вискаса";
    }

    public double toilet() {
        this.weight = weight - 100.0;
        System.out.println("Кошка сходила в туалет");
        return weight;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public void setDead() {
        if (alive) {
            alive = false;
            catCount--;
        }
    }

    public String getStatus() {
        if (weight < minWeight) {
            setDead();
            return "Кошка умерла";
        } else if (weight > maxWeight) {
            setDead();
            return "Кошка взорвалась";
        } else if (weight > originWeight) {
            return "Кошка спит";
        } else {
            return "Кошка играет";
        }
    }
}