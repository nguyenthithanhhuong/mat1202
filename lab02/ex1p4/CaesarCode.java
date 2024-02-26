package lab02.ex1p4;

public class CaesarCode {
    public static void main(String[] args) {
        test();
    }
    public static String caesarCode(String inputStr) {
        String result = "";
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            result += (char) (ch + 3);
        }
        return result.toUpperCase();
    }

    public static void test() {
        String inputStr = "testing";
        String result = caesarCode(inputStr);
        System.out.println("Input String: " + inputStr);
        System.out.println("Output String: " + result);
    }
}
