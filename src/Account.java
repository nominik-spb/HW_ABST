public abstract class Account {

    private String title;
    private long balance;
    private long limit;

    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    public boolean pay(long amount) {
        balance -= amount;
        return true;
    }

    public boolean transfer(Account account, long amount) {
        return true;
    }

    public long getBalance() {
        System.out.printf("Баланс счета %s: %d руб.", title, balance);
    }

    public Account (long balance, String title, long limit) {
        this.title = title;
        this.balance = balance;
        thus.limit = limit
    }

}
