import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите ФИО:");
        String inputName = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();

        if (inputName.equals("")) {
            System.out.println("Вы ничего не ввели");
        } else if (searchWord(inputName)) {
            System.out.println("Вы ввесли всего одно слово");
        } else if (searchOfOneSpace(inputName)) {
            System.out.println("Вы ввесли всего два слова");
        } else if (searchOfTwoSpaces(inputName)) {

            String surname = inputName.substring(0, inputName.indexOf(" "));
            String surnameUp = "Фамилия: " + surname;

            String name = inputName.substring(inputName.indexOf(" "), inputName.lastIndexOf(" "));
            String nameUp = "Имя: " + name;

            String patronymic = inputName.substring(inputName.lastIndexOf(" "));
            String patronymicUp = "Отчество: " + patronymic;

            System.out.println(surnameUp + "\n" + nameUp + "\n" + patronymicUp);
        } else {
            System.out.println("Некорректный ввод");
        }
    }


    private static boolean searchWord(String inputName) {
        int numberOfWords = inputName.length();
        boolean findWord = true;
        for (int startWord = 0; startWord < numberOfWords; startWord++) {
            String oneNumber = inputName.substring(startWord, startWord + 1);
            if (oneNumber.equals(" ")) {
                findWord = false;
                break;
            } else {
                findWord = true;
            }
        }
        return findWord;
    }

    private static boolean searchOfOneSpace(String inputName) {
        String firstWord = inputName.substring(0, inputName.indexOf(" "));
        String secondWord = inputName.substring(0, inputName.lastIndexOf(" "));
        return firstWord.equals(secondWord);
    }

    private static boolean searchOfTwoSpaces(String inputName) {
        String firstPart = inputName.substring(0, inputName.lastIndexOf(" "));
        boolean firstSpace = (firstPart.substring(firstPart.indexOf(" "), firstPart.lastIndexOf(" ") + 1)).equals(" ");
        boolean secondSpace = (inputName.substring(inputName.lastIndexOf(" "), inputName.lastIndexOf(" ") + 1)).equals(" ");
        if (firstSpace && secondSpace) {
            return true;
        } else {
            return false;
        }
    }
}

