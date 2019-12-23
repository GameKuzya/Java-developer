
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = cat.createTwinCat();

        System.out.println(cat.getWeight());
        System.out.println(cat.getStatus());

        System.out.println(cat1.getWeight());
        System.out.println(cat1.getStatus());

    }
}