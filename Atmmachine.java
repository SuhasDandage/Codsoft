import java.util.*;
class Atm
{
      float Balance;
      int pin=1234;
      public void checkpin()
      {
          System.out.println("Enter your pin:");
           Scanner sc=new Scanner(System.in);
           int enterpin=sc.nextInt();
            if(enterpin==pin)
            {
              menu();
            }
           else
            {
               System.out.println("Incorrect Pin");
            }
       }
       public void menu()
       {
        
        System.out.println(" ------+ MENU +------");
        System.out.println("| 1.Check A/c Balance|");
        System.out.println("| 2.Withdraw Money   |");
        System.out.println("| 3.Deposit Money    |");
        System.out.println("| 4.Exit             |");
        System.out.println(" --------------------");
        System.out.println("Enter your choice");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
         
         if(opt==1)
          {
             checkBalance();
             
           }
         else if(opt==2)
           {
             withdrawMoney();
             
           }
         else if(opt==3)
           {
             depositMoney();
             
           }
          else if(opt==4)
           {
               System.out.println("Thank You..!");
               return;
            }
           else
            {
              System.out.println("Enter a valid choice");
            }
         
       }
   public void checkBalance()
     {
          System.out.println("--------------------|");
          System.out.println("Balance:"+Balance+ "      |");
          System.out.println("--------------------|");
          menu();
      }
   public void withdrawMoney()
      {
         System.out.println("Enter Amount to withdraw");
        
         Scanner sc=new Scanner(System.in);
         float amount=sc.nextFloat();
         if(amount>Balance)
         {
            System.out.println("Insufficient Balance..");
          }
         else
          {
             Balance= Balance-amount;
             System.out.println("Money withdrawl successful");
           }
          menu();
       }
       public void depositMoney()
        {
          System.out.println("Enter the Amount:");
          Scanner sc=new Scanner(System.in);
          float amount=sc.nextFloat();
          Balance=Balance+amount;
          System.out.println("Money Deposited Successfully");
          menu();
         }
}
class Atmmachine
{
   public static void main(String args[])
   {
      Atm obj=new Atm();
      obj.checkpin();
 
   }
 }