import java.util.*;
import java.sql.Timestamp;
class Transactions
{  
    String from;
    Customer customer;
    String to;
    String TimeStamp;
    double Amount_Value;
   private double balance;
  public Transactions(String from,String to)
   {
     this.from=from;
     this.to=to;
   }
   public Transactions()
   {
     balance=1000;
   }
   public void setbalance(double balance)
   {
     this.balance=balance;
   }
   public double Getbalance()
    {
     return balance;
    }
    public boolean canDebit(double Amount_Value)
    {
      return (Amount_Value<=balance);
    }
    public void  debit(double Amount_Value)
     {
       if(canDebit(Amount_Value))
       {
         System.out.println("Current balance is Rs"+balance);       
         balance -= Amount_Value;
         System.out.println("Current balance after the transaction is Rs"+ balance);
         Date date= new Date();
         long time = date. getTime();
         Timestamp ts = new Timestamp(time);
         System.out.println("Amount debited at "+ts+"from account number"+customer.GetAccount());
        }
       else
        {
         System.out.println("Account number " +" has insufficient amounts to debit" +Amount_Value);
        } 
    }
  
  public  void credit(double anAmount)
   {
     System.out.println("current balance is Rs " +balance);
     balance += anAmount;
     System.out.println("current balance after the transaction is Rs"+ balance);
     Date date= new Date();
     long time = date. getTime();
     Timestamp ts = new Timestamp(time);
     System.out.println("an amount "+ anAmount+"has been credited at"+ts);
    }

}