package app;

class AccountValue
{
    private long amount;

    AccountValue(long amount)
    {
        this.amount = amount;
    }

    void increase(long amount)
    {
        this.amount += amount;
    }

    void decrease(long amount)
    {
        this.amount -= amount;
    }

    long getAmount()
    {
        return amount;
    }
}
