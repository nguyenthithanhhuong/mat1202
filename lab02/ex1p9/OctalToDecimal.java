package lab02.ex1p9;

public class OctalToDecimal {
    public static void main(String[] args) {
        test();
    }

    public static int octalToDecimal(String octalStr) {
        int octal = Integer.parseInt(octalStr);
        int decimal = 0;
        int n = 0;
        while(true){
            if(octal == 0){
                break;
            } else {
                int temp = octal%10;
                decimal += temp*Math.pow(8, n);
                octal = octal/10;
                n++;
            }
        }
        return decimal;
    }

    public static boolean isOctal(String octalStr) {
        for (int i = 0; i < octalStr.length(); i++) {
            if (!(octalStr.charAt(i) >= '0'
                    || octalStr.charAt(i) <= '7')) return false;
        }
        return true;
    }

    public static void test() {
        String octal = "147";

        System.out.printf("Input octal: %s\n", octal);
        int result = octalToDecimal(octal);
        if (result != -1) {
            System.out.println("Output decimal: " + result);
        } else {
            System.out.println("error");
        }
    }
}
