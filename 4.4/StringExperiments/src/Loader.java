public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int firstIndex = text.indexOf("5");
        int secondIndex = text.indexOf(" рублей");
        int thirdIndex = text.indexOf("30");
        int fourthIndex = text.lastIndexOf(" рублей");

        int vasya = Integer.parseInt(text.substring(firstIndex,secondIndex));
        int masha = Integer.parseInt(text.substring(thirdIndex, fourthIndex));

        System.out.println(vasya);
        System.out.println(masha);

        int resultat = vasya + masha;

        System.out.println("Вася и Маша заработали: " + resultat + " рублей");
    }
}