package lab02.ex1p3;

public class PhoneKeyPad {
    public static void main(String[] args) {
        test();
    }

    public static String phoneKeyPad(String inputStr) {
        inputStr = inputStr.toLowerCase();
        String result = "";
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            switch (ch) {
                case 'a':
                case 'b':
                case 'c':
                    result += "2";
                    break;
                case 'd':
                case 'e':
                case 'f':
                    result += "3";
                    break;
                case 'g':
                case 'h':
                case 'i':
                    result += "4";
                    break;
                case 'j':
                case 'k':
                case 'l':
                    result += "5";
                    break;
                case 'm':
                case 'n':
                case 'o':
                    result += "6";
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    result += "7";
                    break;
                case 't':
                case 'u':
                case 'v':
                    result += "8";
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    result += "9";
                    break;
            }
        }
        return result;
    }

    public static void test() {
        String str = "AehJOqtX";
        String result = phoneKeyPad(str);
        System.out.println("Input String: " + str);
        System.out.println("Output String: " + result);
    }
}
