package account;

public class CreditAccount extends Account {

//private long limit;

    public CreditAccount(long limit, String title) {
        this.limit = limit;
        this.title = title;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount <= 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= limit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
