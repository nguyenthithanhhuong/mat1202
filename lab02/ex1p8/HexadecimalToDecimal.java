package lab02.ex1p8;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        test();
    }
    public static int hexadecimalToDecimal(String hexStr) {
        int len = hexStr.length();
        int base = 1;
        int dec_val = 0;

        for (int i = len - 1; i >= 0; i--) {
            if (hexStr.charAt(i) >= '0'
                    && hexStr.charAt(i) <= '9') {
                dec_val += (hexStr.charAt(i) - 48) * base;
                base = base * 16;
            }
            else if (hexStr.charAt(i) >= 'A'
                    && hexStr.charAt(i) <= 'F') {
                dec_val += (hexStr.charAt(i) - 55) * base;
                base = base * 16;
            }
        }

        return dec_val;
    }

    public static void test() {
        String hex = "1a";

        System.out.printf("Input hexadecimal: %s\n", hex);
        int result = hexadecimalToDecimal(hex.toUpperCase());

        System.out.println("Output decimal: " + result);
    }
}
