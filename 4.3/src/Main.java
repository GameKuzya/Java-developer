import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int box;

        System.out.println("Введите кол-во ящиков?");
        box = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        Cargo cargo = new Cargo(box);
        cargo.resultat();
    }
}
