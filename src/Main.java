import BankClients.Client;
import BankClients.IndividualClient;
import BankClients.IndividualEntrepreneur;
import BankClients.LegalEntity;

public class Main
{
    public static void main(String[] args)
    {
        Client individualClient = new IndividualClient(10000);
        Client legalEntity = new LegalEntity(100000);
        Client individualEntrepreneur = new IndividualEntrepreneur(50000);

      // individualClient.getBalance();
      // individualClient.getWithdraw();
      // individualClient.getDeposit();

      // legalEntity.getBalance();
      // legalEntity.getWithdraw();
      // legalEntity.getDeposit();

        individualEntrepreneur.getBalance();
        individualEntrepreneur.getWithdraw();
        individualEntrepreneur.getDeposit();

    }
}
