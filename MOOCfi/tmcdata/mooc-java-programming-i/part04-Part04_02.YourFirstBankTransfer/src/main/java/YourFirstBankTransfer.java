public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mathewsAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        mathewsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mathewsAccount.toString());
        System.out.println(myAccount.toString());
    }
}
