package app;

class SavingsAccount
{
    private Account account;

    SavingsAccount(long amount)
    {
        account = new Account("savings", amount);
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
