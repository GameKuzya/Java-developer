
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double feed;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void meow()
    {
        do {
            weight = weight - 1;
        } while (weight > minWeight);
        System.out.println("Meow");
    }


    public void feed(Double amount)
    {
        this.weight = weight + amount;
    }

    public String getFeed()
    {
        feed = weight - originWeight;
        return "Кошка съела: " + feed + " грамм вискаса";
    }

    public double toilet()
    {
        this.weight = weight - 100.0;
        System.out.println("Кошка сходила в туалет");
        return weight;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}