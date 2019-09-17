package app;

class SavingsAccount implements IAccountBalance
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

    public String getName()
    {
        return "savings";
    }

    public long getBalance()
    {
        return accountValue.getAmount();
    }
}
