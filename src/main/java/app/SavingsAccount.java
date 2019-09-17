package app;

class SavingsAccount
{
    private Account account;

    SavingsAccount(long amount)
    {
        account = new Account(amount);
    }

    void deposit(long amount)
    {
        account.deposit(amount);
    }

    String getName()
    {
        return "savings";
    }

    long getAmount()
    {
        return account.getAmount();
    }
}
