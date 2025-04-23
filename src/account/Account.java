package account;

public abstract class Account {

    protected long limit;
    protected long balance;
    protected String title;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if (account.add(amount)) {
                return true;
            }
            add(amount);
        }
        return false;
    }
}
