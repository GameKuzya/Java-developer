public class Cat {
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

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        alive = true;
        catCount++;
    }

    public void meow() {
        setDead();
        do {
            weight = weight - 1;
        } while (weight > minWeight);
        System.out.println(getStatus());
    }


    public void feed(Double amount) {
        if (alive) {
            weight = weight + amount;
        }
        if (weight>maxWeight) {
            setDead();
            System.out.println(getStatus());
        }
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
            return "Кошка умерла";
        } else if (weight > maxWeight) {
            return "Кошка взорвалась";
        } else if (weight > originWeight) {
            return "Кошка спит";
        } else {
            return "Кошка играет";
        }
    }
}