package lab11.decorator.ex03;

public class Application {
    public static void dumbUsageExample() {
        // Khởi tạo một FileDataSource để ghi dữ liệu vào tệp "somefile.dat"
        DataSource source = new FileDataSource("somefile.dat");

        // Ghi dữ liệu (plain data) vào tệp từ đối tượng FileDataSource
        source.writeData("Test decorator");
        System.out.println("The target file has been written with plain data.");

        // Thêm tính năng nén dữ liệu vào FileDataSource
        source = new EncryptionDecorator(source);

        // Ghi dữ liệu (đã nén) vào tệp từ đối tượng có EncryptionDecorator
        source.writeData("Test decorator");
        System.out.println("The target file has been written with compressed data.");

        // Thêm tính năng mã hóa dữ liệu vào FileDataSource
        source = new EncryptionDecorator(source);

        // Ghi dữ liệu (đã nén và đã mã hóa) vào tệp từ đối tượng có cả EncryptionDecorator và EncryptionDecorator
        source.writeData("Test decorator");
        System.out.println("The file has been written with compressed and encrypted data.");
    }

    public static void main(String[] args) {
        dumbUsageExample();
    }
}
