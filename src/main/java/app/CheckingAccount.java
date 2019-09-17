package app;

class CheckingAccount
{
    private Account account;

    CheckingAccount(long amount)
    {
        account = new Account(amount);
    }

    void withdraw(long amount)
    {
        account.setAmount(getAmount() - amount);
    }

    void deposit(long amount)
    {
        account.deposit(amount);
    }

    String getName()
    {
        return "checking";
    }

    long getAmount()
    {
        return account.getAmount();
    }
}
