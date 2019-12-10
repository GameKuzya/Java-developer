public class Cargo {
    private int truck;
    private int container;
    private int box;

    public Cargo(int box) {
        this.box = box;
        if (box != 0) {
            container = box % 27 == 0 ? box / 27 : box / 27 + 1;
        }
        if (container != 0) {
            truck = container % 12 == 0 ? container / 12 : container / 12 + 1;
        }
    }

    public void resultat() {
        int a = 1;
        int b = 1;
        for (int i = 1; i <= truck; i++) {
            System.out.printf("Грузовик %d:\n", i);
            int c = 0;
            while (c < 12 && b <= container) {
                System.out.printf("Контейнер %d:\n", b);
                int d = 0;
                while (d < 27 && a <= box) {
                    System.out.printf("Ящик %d\n", a);
                    d++;
                    a++;
                }
                c++;
                b++;
                System.out.println();
            }
        }
    }
}
