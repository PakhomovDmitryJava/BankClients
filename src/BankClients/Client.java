package BankClients;

import java.util.Scanner;

public abstract class Client
{
    private double balance;
    private double withdraw;
    private double deposit;

    Scanner scanner = new Scanner(System.in);

    public Client(double balance)
    {
        this.balance = balance;
    }

    public abstract double getBalance();

    public abstract double getWithdraw();

    public abstract double getDeposit();


}
