
package assignment14_b;

public class Account implements iMailable
{   
   private String name; 
   private double balance;
 
   public Account(String name, double balance) 
   {
      this.name = name;

      if (balance > 0) 
         this.balance = balance; 
   }

   public void deposit(double deposit) 
   {      
      if (deposit> 0) 
         balance = balance + deposit; 
   }
   
   public void withdraw(double withdraw) 
   {      
      if (withdraw <= balance) 
         balance = balance - withdraw;
      
      else 
      {
          System.out.println("insufficient funds");
      }
   }
   
   public double getBalance()
   {
      return balance; 
   } 

   public void setName(String name)
   {
      this.name = name; 
   } 

   public String getName()
   {
      return name; 
   } 
   
   @Override
    public void printStatement()
    {
    System.out.println("Hello " + name + ", Your Account Balance is: $" + balance);
    
    }
}
