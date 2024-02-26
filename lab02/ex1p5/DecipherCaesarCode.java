package lab02.ex1p5;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        test();
    }

    public static String dicipherCaesarCode(String inputStr) {
        String result = "";
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            result += (char) (ch - 3);
        }
        return result.toUpperCase();
    }

    public static void test() {
        String inputStr = "wHVwLQJ";
        String result = dicipherCaesarCode(inputStr.toLowerCase());
        System.out.println("Input String: " + inputStr);
        System.out.println("Output String: " + result);
    }
}
