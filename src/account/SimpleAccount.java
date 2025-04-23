package account;

public class SimpleAccount extends Account {

    public SimpleAccount(long limit, String title) {
        this.limit = limit;
        this.title = title;
    }

    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance >= amount) {
            balance -=amount;
            return true;
        }
        return false;
    }
}
