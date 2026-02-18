package s13HerancaANDPolimorfismo.Aulas.Aula001.aplication;

import s13HerancaANDPolimorfismo.Aulas.Aula001.entities.Account;
import s13HerancaANDPolimorfismo.Aulas.Aula001.entities.BusinessAcount;
import s13HerancaANDPolimorfismo.Aulas.Aula001.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "alex", 0.0);
        BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0.0, 500.0);
        //UPCASTINg
        Account acc1 = bacc;
        Account acc2 = new BusinessAcount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DOWNCASTING
        BusinessAcount acc4 = (BusinessAcount) acc2;
        acc4.loan(100.0);
        //  BusinessAcount acc5 = (BusinessAcount) acc3;
        if (acc3 instanceof BusinessAcount) {
            BusinessAcount acc5 = (BusinessAcount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }
        Account acc6 = new Account(1005, "Alex", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());


        Account acc7 = new SavingsAccount(1006, "Maria", 1000.0,0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAcount(1007, "Jota", 1000.0,1000.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());


    }
}
