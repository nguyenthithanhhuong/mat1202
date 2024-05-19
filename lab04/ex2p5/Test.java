package lab04.ex2p5;

public class Test {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Customer customer = new Customer(182, "thankhuoq", 'f');
        System.out.println("Customer: " + customer);

        Account account = new Account(1812, customer, 15.09);
        System.out.println("Origin account:");
        System.out.println(account);

        System.out.println("Account after use deposit():");
        account.deposit(28.44);
        System.out.println(account);

        System.out.println("Account after use withdraw():");
        account.withdraw(10.04);
        System.out.println(account);
    }
}
