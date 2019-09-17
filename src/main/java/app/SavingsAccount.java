package app;

class SavingsAccount
{
    private AccountValue accountValue;

    SavingsAccount(long amount)
    {
        accountValue = new AccountValue(amount);
    }

    void deposit(long amount)
    {
        accountValue.increase(amount);
    }

    String getName()
    {
        return "savings";
    }

    long getAmount()
    {
        return accountValue.getAmount();
    }
}
