package src;

import java.util.Currency;

public class Account {
  private Transaction[] transactions;
  
  
  
  public double balance(){
    return -1d;
  }

  public static void main(String[] args){
    Account account = new Account();
    account.add(new Transaction(Sign.CREDIT, Currency.HKD, 2500));
    account.add(new Transaction(Sign.CREDIT, Currency.HKD, 1300)); 
    System.out.println(account.balance());

    account.credit(Currency.HKD, 1000);
    account.debit(Currency.HKD, 1000);
  }
}
