package lab02.ex1p7;

public class BinaryToDecimal {
    public static void main(String[] args) {
        test();
    }

    public static int binaryToDecimal(String binaryStr) {
        int binary = Integer.parseInt(binaryStr);
        int decimal = 0;
        if (!isBinary(binaryStr)) decimal = -1;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

    public static boolean isBinary(String binaryStr) {
        for (int i = 0; i < binaryStr.length(); i++) {
            if (!(binaryStr.charAt(i) == '0'
                    || binaryStr.charAt(i) == '1')) return false;
        }
        return true;
    }

    public static void test() {
        String binary01 = "1011";

        System.out.printf("Input binary: %s\n", binary01);
        int result = binaryToDecimal(binary01);
        if (result != -1) {
            System.out.println("Output decimal: " + result);
        } else {
            System.out.println("error");
        }
    }
}
