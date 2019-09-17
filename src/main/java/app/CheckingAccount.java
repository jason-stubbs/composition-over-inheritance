package app;

class CheckingAccount
{
    private Account account;

    CheckingAccount(long amount)
    {
        account = new Account("checking", amount);
    }

    void withdraw(long amount)
    {
        setAmount(getAmount() - amount);
    }

    void deposit(long amount)
    {
        account.deposit(amount);
    }

    String getName()
    {
        return account.getName();
    }

    long getAmount()
    {
        return account.getAmount();
    }

    void setAmount(long amount)
    {
        account.setAmount(amount);
    }
}
