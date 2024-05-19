package lab06.ex1p3;

public class TestMain {
    public static void main(String[] args) {
        testPoint3D();
    }

    public static void testPoint3D() {
        Point3D point3D = new Point3D(1.8f, 1.2f, 0.3f);
        System.out.printf("1. Test toString():\n%s\n", point3D.toString());
        System.out.printf("2. Test setZ(%.2f) and getZ():\n", 10.4f);
        point3D.setZ(10.4f);
        System.out.printf("Z = %f\n", point3D.getZ());
        System.out.println("3. Test setXYZ(): ");
        point3D.setXYZ(10.4f, 15.2f, 9.8f);
        System.out.println(point3D.toString());
    }
}
