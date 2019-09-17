package app;

class Account
{
    private long amount;

    Account(long amount)
    {
        setAmount(amount);
    }

    void deposit(long amount)
    {
        this.amount += amount;
    }

    long getAmount()
    {
        return amount;
    }

    void setAmount(long amount)
    {
        this.amount = amount;
    }
}
