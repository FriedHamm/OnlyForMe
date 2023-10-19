package Test1;

public class Account {
    private int balance;

    private final int accountNumber;
    private final String accountOwner;

    public Account(int balance, int accountNumber, String accountOwner) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
    }

    public void accountInfo()
    {
        System.out.println(accountNumber+"   "+accountOwner+"   "+balance);
    }

    public boolean takeBalance(int balance)
    {
        if(this.balance - balance < 0)
        {
            return false;
        }
        else {
            this.balance -= balance;
            return true;
        }
    }

    public void addBalane(int balance)
    {
        this.balance += balance;
    }
}
