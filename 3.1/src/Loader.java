
public class Loader {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        {
            System.out.println("Cat весит: " + cat.getWeight());
            cat.feed(100.0);
            System.out.println("Cat весит: " + cat.getWeight());
            cat.feed(10000.0);
            System.out.println("Cat весит: " + cat.getWeight());
            System.out.println("Статус Cat: " + cat.getStatus());
        } // Кормим cat

        {
            System.out.println("Cat весит: " + cat1.getWeight());
            cat1.meow();
            System.out.println("Cat весит: " + cat1.getWeight());
            System.out.println("Стаус Cat: " + cat1.getStatus());
        } // Замяукать cat1

        /*System.out.println(cat2.getWeight());
        System.out.println(cat3.getWeight());
        System.out.println(cat4.getWeight());


         */
    }
}