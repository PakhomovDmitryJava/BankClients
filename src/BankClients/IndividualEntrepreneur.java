package BankClients;

public class IndividualEntrepreneur extends Client
{
    public double balance;
    public double withdraw;
    public double deposit;

    public IndividualEntrepreneur(double balance)
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
            getBalance();;

        }
        return balance;
    }

    @Override
    public double getDeposit() {
        System.out.println("How much money do you want to deposit?");
        deposit = scanner.nextDouble();
        if (deposit >= 1000) {
            balance = balance + (deposit - (deposit * 0.005));
            getBalance();;
        }
        else {
            balance = balance + (deposit - (deposit * 0.01));
            getBalance();
            //System.out.println("Now you balance is " + balance);
        }
        return balance;
    }

}
