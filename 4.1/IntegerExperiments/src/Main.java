public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
        System.out.println(container.count);
        System.out.println(sumDigits(789));
    }

    public static Integer sumDigits(Integer number) {

        String str = Integer.toString(number);
        int intStr = str.length();
        int sum = 0;
        for (int i = 0; i < intStr; i++) {
            sum = sum + Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }
}
