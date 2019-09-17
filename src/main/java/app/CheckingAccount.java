package app;

class CheckingAccount implements IAccountBalance
{
    private AccountValue accountValue;

    CheckingAccount(long amount)
    {
        accountValue = new AccountValue(amount);
    }

    void withdraw(long amount)
    {
        accountValue.decrease(amount);
    }

    void deposit(long amount)
    {
        accountValue.increase(amount);
    }

    public String getName()
    {
        return "checking";
    }

    public long getBalance()
    {
        return accountValue.getAmount();
    }
}
