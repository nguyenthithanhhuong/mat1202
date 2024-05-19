package lab10.singleton.ex02;

public class Database {
    private static Database instance;

    private Database() {

    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query() {
        System.out.println("Queried");
    }
}