import java.util.ArrayList;
import java.util.Scanner;
public class Bank
{
  static ArrayList<Customer> customers;
  static Scanner sc;
    public int  searchbyID(double account_id)
    {
      for(int i=0;i<customers.size();i++)
      {
        if(account_id==customers.get(i).GetAccount())
         return i;
      }
        return -1;
    }
    public void Debit()
    {
      System.out.println("enter the account id:");
      double id = sc.nextDouble();
      int index=searchbyID(id); 
      if(index==-1)
      {
        System.out.println("account not found!!!");
        return;
      }
       System.out.println("enter the amount to withdraw!!!!");
       double amount = sc.nextDouble();
       customers.get(index).debit(amount);
        System.out.println("operation successfull !!!@@===");
      
    }
    public void credit()
    {
      System.out.println("enter the account number??");
      double id=sc.nextDouble();
      int index=searchbyID(id);
      if(index==-1)
      {
        System.out.println("account not found !!!!!");
        return;
      }
      System.out.println("enter the amount to credit!!!!");
      double amount = sc.nextDouble();
      customers.get(index).credit(amount);
      
        System.out.println("amount successfully credited !!!@@===");
      
    }
    
    public  void addAccount()
    {
      sc.nextLine();
      System.out.println("enter customer Name:");
      String name = sc.nextLine();
      System.out.println("enter address of the customer :");
      String address=sc.nextLine();
      System.out.println("enter the age of the customer:");
      int age = sc.nextInt();
      sc.nextLine();
      System.out.println("enter the branch name:");
      String branch=sc.nextLine();
      sc.nextLine();
      System.out.println("enter gender:");
      String gender=sc.nextLine();
       System.out.println("enter the balance");
       double balance=sc.nextDouble();
       Customer newcustomer = new Customer(name,address,age,branch,gender);
       System.out.println("enter the account number?");
       double account_id=sc.nextDouble();
       newcustomer.setAccount(account_id);
       newcustomer.setBalance(balance);
        customers.add(newcustomer);
        System.out.println("account created:::!!!!");
    }


     public static void main(String args[])
     {
       Bank b = new Bank();
       ArrayList<Customer> customers = new ArrayList<Customer>();
       sc=new Scanner(System.in);
       b.addAccount();
       
     } 
    }