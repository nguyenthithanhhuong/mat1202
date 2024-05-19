package lab05.ex1p5;

public class MyDate {
    private int year;
    private int month;
    private int day;

    private static String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) return true;
        if (year % 100 == 0 && year % 400 == 0) return true;
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        boolean condition01 = year >= 1 && year <= 9999;
        boolean condition02 = month >= 1 && month <= 12;
        boolean condition03 = false;
        if (condition02) condition03 = day >= 1 && day <= DAYS_IN_MONTHS[month - 1];

        return condition01 && condition02 && condition03;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int dayOfWeek = -1;
        if (isValidDate(year, month, day)) {
            if (month < 3) {
                month += 12;
                year -= 1;
            }
            int K = year % 100;
            int J = year / 100;
            dayOfWeek = (day + ((13 * (month + 1)) / 5) + K + (K / 4) + (J / 4) - (2 * J)) % 7 - 1;
        }
        return dayOfWeek;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        String dayOfWeek = DAYS[getDayOfWeek(year, month, day)];
        String month = MONTHS[getMonth() - 1];
        return String.format("%s %d %s %d",
                dayOfWeek, day, month, year);
    }

    public MyDate nextDay() {
        day++;
        if (day > DAYS_IN_MONTHS[month - 1]) {
            day = 1;
            nextMonth();
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            nextYear();
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        return this;
    }

    public MyDate previousDay() {
        day--;
        if (day < 1) {
            previousMonth();
            day = DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month < 1) {
            month = 12;
            previousYear();
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        return this;
    }
}
