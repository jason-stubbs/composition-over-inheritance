package app;

class CheckingAccount
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

    String getName()
    {
        return "checking";
    }

    long getBalance()
    {
        return accountValue.getAmount();
    }
}
