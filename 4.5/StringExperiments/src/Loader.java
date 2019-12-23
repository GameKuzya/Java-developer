public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        String[] money = text.replaceAll("[\\D]", " ").trim().split("\\s+");

        int sum = 0;

        for (int i = 0; i < money.length; i++)
        {
            sum = Integer.parseInt(money[i]) + sum;
        }
        System.out.println("Сумма заработков: " + sum + " рублей");
        }
    }