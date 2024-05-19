package lab06.ex1p2;

public class TestMain {
    public static void main(String[] args) {
        testStaff();
        testStudent();
    }

    public static void testStaff() {
        Staff staff = new Staff("Staff01", "Address01", "School01", 18.12);
        System.out.println("1. Test Staff");
        System.out.printf("Test toString():\n %s\n", staff.toString());
        System.out.println("Test getter: ");
        System.out.println("Staff:" +
                "name = " + staff.getName() + ", " +
                "address = " + staff.getAddress() + ", " +
                "school = " + staff.getSchool() + ", " +
                "pay = " + staff.getPay()
        );
    }

    public static void testStudent() {
        Student student = new Student("Student02", "Address02", "Program02", 2024, 10.04);
        System.out.println("2. Test Student");
        System.out.printf("Test toString():\n %s\n", student.toString());
        System.out.println("Test getter:");
        System.out.println("Student:" +
                "name = " + student.getName() + ", " +
                "address = " + student.getAddress() + ", " +
                "program = " + student.getProgram() + ", " +
                "fee = " + student.getFee()
        );
    }
}
