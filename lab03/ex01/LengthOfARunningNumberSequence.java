package lab03.ex01;

public class LengthOfARunningNumberSequence {
    public static void main(String[] args) {
        test();
    }
    public static int findSequenceLength(int n) {
        if (n == 1) {
            return 1;
        }
        return (n + "").length() + findSequenceLength(n-1);
    }

    public static void test() {
        for (int num = 1; num < 15; num++) {
            System.out.printf("Length of S(%d) is: %d\n", num, findSequenceLength(num));
        }
    }
}
