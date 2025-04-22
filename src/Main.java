import account;

public class Main {

    public static void main(String[] args) {

        Account account1 = new SimpleAccount(0, "Простой счет", 0);
        Account account2 = new CreditAccount(0, "Кредитный счет", -200000);
    }
}
