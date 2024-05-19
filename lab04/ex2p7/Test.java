package lab04.ex2p7;

public class Test {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        MyPoint point01 = new MyPoint(1, 2);
        MyPoint point02 = new MyPoint(3, 4);

        MyLine line = new MyLine(point01, point02);
        System.out.println("1. Test constructor and toString():");
        System.out.println(line.toString());

        System.out.println("2. Test getLength():");
        System.out.println(line.getLength());

        System.out.println("3. Test getGradient():");
        System.out.println(line.getGradient());

        System.out.println("4. Test setBegin():");
        line.setBegin(new MyPoint(5, 6));
        System.out.print("line after setBegin(): " + line.toString());
    }
}
