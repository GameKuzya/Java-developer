
public class Loader {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        System.out.println("Вес кошки до еды: " + cat2.getWeight());
        cat2.feed(1000.0);
        System.out.println("Вес кошки после еды: " + cat2.getWeight());
        System.out.println(cat2.getFeed());

        cat2.toilet();
        System.out.println("Вес кошки после туалета: " + cat2.getWeight());


/*
        System.out.println("murka status: " + murka.getStatus());
        System.out.println("murka weight: " + murka.getWeight());
        murka.feed(100.0);
        murka.feed(150.0);
        murka.feed(200.0);
        System.out.println("murka weight: " + murka.getWeight());
        murka.verni();
        System.out.println("murka weight: " + murka.getWeight());
        murka.toilet();
        System.out.println("murka weight: " + murka.getWeight());

 */
    }
}