import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер телефона");
        String number = reader.readLine();
        System.out.println(number.replaceAll("[^+0-9]", " "));
        System.out.println(number.replaceAll("[^0-9 ()+]", ""));
        System.out.println(number.replaceAll("[^0-9,-]", ""));

    }
}
