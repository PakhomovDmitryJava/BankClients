package BankClients;

public class IndividualClient extends Client
{
    public double balance;
    public double withdraw;
    public double deposit;

    public IndividualClient(double balance)
    {
        super(balance);
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        System.out.println("Yor balance is " + balance);
        return balance;
    }

    @Override
    public double getWithdraw() {
        System.out.println("How much money do you want to withdraw?");
        withdraw = scanner.nextDouble();
        if (withdraw > balance) {

            System.out.println("You don't have enough money! You can take a loan!");
        }
        else {
            balance -= withdraw;
            System.out.println("Now you balance is " + balance);

        }
        return balance;
    }

    public double getDeposit()
    {
        System.out.println("How much money do you want to deposit?");
        deposit = scanner.nextDouble();
        balance += deposit;
        System.out.println("Now you balance is " + balance);
        return balance;
    }
}
