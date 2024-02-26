package lab02.ex1p6;

public class CheckHexString {
    public static void main(String[] args) {
        test();
    }

    public static boolean isHexString(String hexStr) {
        for (int i = 0; i < hexStr.length(); i++) {
            char ch = hexStr.charAt(i);
            if (!((ch >= '0' && ch <= '9')
            || (ch >= 'A' && ch <= 'F')
            || (ch > 'a' && ch <= 'f'))) return false;
        }
        return true;
    }

    public static void test() {
        String str01 = "123aBc";
        String str02 = "123aBex";
        System.out.printf("Input String %s\n\"%s\" is a hex string?: %s", str01, str01, isHexString(str01));
        System.out.printf("Input String %s\n\"%s\" is a hex string?: %s", str02, str02, isHexString(str02));
    }
}
