public class Main {

    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ";
        for (int i = 0;i<alphabet.length();i++) {
            char ch = alphabet.charAt(i);
            int unicode = alphabet.codePointAt(i);
            System.out.println("Код буквы " + ch + " = " + unicode);
        }
    }
}
