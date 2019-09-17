package app;

class Account
{
    private long amount;

    Account(long amount)
    {
        this.amount = amount;
    }

    void deposit(long amount)
    {
        this.amount += amount;
    }

    void withdraw(long amount)
    {
        this.amount -= amount;
    }

    long getAmount()
    {
        return amount;
    }
}
