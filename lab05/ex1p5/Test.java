package lab05.ex1p5;

public class Test {
    public static void main(String[] args) {
        testIsLeapYear();
        testIsValidDate();
        testGetDayOfWeek();
        testToString();
        testNextMethods();
        testPreviousMethods();
    }

    public static void testIsLeapYear() {
        String test = "isLeapYear";
        System.out.printf("+ Test %s():\n", test);
        System.out.printf("test(%d): %s\n", 2024, MyDate.isLeapYear(2024));
        System.out.printf("test(%d): %s\n", 2000, MyDate.isLeapYear(2000));
        System.out.printf("test(%d): %s\n", 1900, MyDate.isLeapYear(1900));
    }

    public static void testIsValidDate() {
        String test = "isValidDate";
        System.out.printf("+ Test %s():\n", test);
        System.out.printf("test(%d,%d,%d): %s\n", 2024, 12, 18, MyDate.isValidDate(2024, 12, 18));
        System.out.printf("test(%d,%d,%d): %s\n", 2000, 2, 30, MyDate.isValidDate(2000, 2, 30));
        System.out.printf("test(%d,%d,%d): %s\n", 1900, 15, 5, MyDate.isValidDate(1900, 15, 5));
    }

    public static void testGetDayOfWeek() {
        String test = "getDayOfWeek";
        System.out.printf("+ Test %s():\n", test);
        System.out.printf("test(%d,%d,%d): %d\n", 2024, 12, 18, MyDate.getDayOfWeek(2024, 12, 18));
        System.out.printf("test(%d,%d,%d): %d\n", 2000, 2, 30, MyDate.getDayOfWeek(2000, 2, 30));
        System.out.printf("test(%d,%d,%d): %d\n", 1900, 15, 5, MyDate.getDayOfWeek(1900, 15, 5));
    }

    public static MyDate createMyDateTest() {
        return new MyDate(2024, 12, 18);
    }

    public static void testToString() {
        String test = "toString";
        System.out.printf("+ Test %s():\n", test);
        MyDate myDate = createMyDateTest();
        System.out.println("Mydate: " + myDate.toString());
    }

    public static void testNextMethods() {
        String test = "testNextMethods";
        System.out.printf("+ Test %s():\n", test);

        MyDate myDate = createMyDateTest();

        myDate.nextDay();
        System.out.printf("nextDay(): %s\n", myDate.toString());

        myDate.nextMonth();
        System.out.printf("nextMonth(): %s\n", myDate.toString());

        myDate.nextYear();
        System.out.printf("nextYear(): %s\n", myDate.toString());
    }

    public static void testPreviousMethods() {
        String test = "testPreviousMethods";
        System.out.printf("+ Test %s():\n", test);

        MyDate myDate = createMyDateTest();

        myDate.previousDay();
        System.out.printf("previousDay(): %s\n", myDate.toString());

        myDate.previousMonth();
        System.out.printf("previousMonth(): %s\n", myDate.toString());

        myDate.previousYear();
        System.out.printf("previousYear(): %s\n", myDate.toString());
    }
}
