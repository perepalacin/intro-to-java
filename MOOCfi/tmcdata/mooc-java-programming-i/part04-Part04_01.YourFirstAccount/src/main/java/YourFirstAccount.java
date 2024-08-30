
public class YourFirstAccount {

    public static void main(String[] args) {
        Account bankAccount = new Account("Pere's Account", 100.0);
        bankAccount.deposit(20);
        System.out.println(bankAccount.saldo());
    }
}
