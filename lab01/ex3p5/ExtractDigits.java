package lab01.ex3p5;

public class ExtractDigits {
    public static void main(String[] args) {
        int num = 15423;
        System.out.printf("Result %s", extractDigits(num));
    }

    public static String extractDigits(int num) {
        String result = "";
        while (num > 0) {
            int digit = num % 10;
            result += digit + " ";
            num /= 10;
        }
        return result;
    }
}
