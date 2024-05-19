package lab11.factorymethod.ex01;

public class Application {
    public static void main(String[] args) {
        Dialog dialog1 = new WindowsDialog();
        dialog1.render();
    }
}