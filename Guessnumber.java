import java.util.*;
class Guessnumber
{
  public static void main(String args[])
   {
     Scanner s =new Scanner(System.in);
     int chances=8;
     int finals=0;
     boolean playAgain=true;
     System.out.println("Welcome .... !");
     System.out.println("____NUMBER GAME____");
     System.out.println("You have about " + chances + " chances to win the game");
      while(playAgain)
      {
         int rand=getrandN(1,100);
         boolean guess=false;
         for(int i=0; i<chances; i++)
         {
            System.out.println("chance"+(i+1)+ " Enter your guess:");
            int user=s.nextInt();
             if(user==rand)
             {
                 guess=true;
                 finals+=1;
                 System.out.println("You won it...");
                  break;
            }
            else if(user>rand)
            {
             System.out.println("Too high");
            }
           else
            {
             System.out.println("Too Low");
            }
   
        }
        if(guess==false)
        {

              System.out.println("Sorry You lost the chances.The number is"+rand);
         }
      System.out.println("Do you want to Play Again(y/n)");
      String pA=s.next();
      playAgain=pA.equalsIgnoreCase("y");
        
    }
     System.out.println("That'it,Hope you enjoyed it");
     System.out.println("Here is your Score:"+finals);
  }
   public static int getrandN(int min,int max)
    {
        return(int)(Math.random()*(max-min+1)+min);
     }
       
}
