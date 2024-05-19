package lab05.ex1p4;

public class Test {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("1.Test constructors and toString()");
        MyTime time1 = new MyTime(23, 59, 59);
        MyTime time2 = new MyTime();
        System.out.println("Time 1: " + time1); // Time 1: 23:59:59
        System.out.println("Time 2: " + time2); // Time 2: 00:00:00

        System.out.println("2.Test setters");
        time2.setHour(12);
        time2.setMinute(30);
        time2.setSecond(45);
        System.out.println("Time 2 after setting: " + time2); // Time 2 after setting: 12:30:45

        System.out.println("3. Test next and previous methods");
        time1.nextSecond();
        System.out.println("Time 1 after nextSecond(): " + time1); // Time 1 after nextSecond(): 00:00:00

        time1.previousSecond();
        System.out.println("Time 1 after previousSecond(): " + time1); // Time 1 after previousSecond(): 23:59:59
        time1.nextMinute();
        System.out.println("Time 1 after nextMinute(): " + time1); // Time 1 after nextMinute(): 00:00:59

        time1.nextHour();
        System.out.println("Time 1 after nextHour(): " + time1); // Time 1 after nextHour(): 01:00:59

        time1.previousMinute();
        System.out.println("Time 1 after previousMinute(): " + time1); // Time 1 after previousMinute(): 01:59:59

        time1.previousHour();
        System.out.println("Time 1 after previousHour(): " + time1); // Time 1 after previousHour(): 00:59:59
    }
}
