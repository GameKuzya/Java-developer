import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ФИО:");
        String fullname = reader.readLine();

        int firstIndex = fullname.indexOf(" ");
        int secondIndex = fullname.lastIndexOf(" ");

        String firstName = fullname.substring(0, firstIndex);
        String secondName = fullname.substring(firstIndex,secondIndex);
        String thirdName = fullname.substring(secondIndex);

        System.out.println("Фамилия: " + firstName);
        System.out.println("Имя: " + secondName);
        System.out.println("Отчество: " + thirdName);
    }
}
