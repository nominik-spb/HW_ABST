package account;

public class Main {

    static Account account1 = new SimpleAccount(0, "Простой счет");
    static Account account2 = new CreditAccount(-200_000, "Кредитный счет");

    public static void main(String[] args) {

        showInfo();
        account1.add(10_000);
        account2.add(15_000);
        showInfo();
        account1.pay(1_000);
        account2.pay(15_000);
        showInfo();
        // проверка на пробивку лимитов
        account1.pay(11_000);
        account2.pay(190_000);
        showInfo();
        account1.transfer(account2, 18_000);
        showInfo();
        // конец проверки на пробитие лимитов
        account1.transfer(account2, 8_000);
        showInfo();

    }

    static void showInfo() {
        System.out.printf("%s: %d руб.", account1.title, account1.getBalance());
        System.out.println();
        System.out.printf("%s: %d руб.", account2.title, account2.getBalance());
        System.out.println();
        System.out.println("________________________________________________");
    }
}
