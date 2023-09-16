import java.util.*;
class Student
{
      public static void main(String args[])
      {
 
       Scanner s=new Scanner(System.in);
       System.out.println("__Student Grade Calculator__");
       System.out.println("Enter the Name of student:");
       String nm=s.nextLine();
       System.out.println("Enter the Roll No:");
       int r=s.nextInt();
       System.out.println("**Enter the Marks of 5 Subjects**");
       System.out.println("Enter the Mark of Database Management:");
       int M1=s.nextInt();
       System.out.println("Enter the Mark of Operating System:");
       int M2=s.nextInt();
       System.out.println("Enter the Mark of Mathematics:");
       int M3=s.nextInt();
       System.out.println("Enter the Mark of Software Engineering:");
       int M4=s.nextInt();
       System.out.println("Enter the Mark of Java:");
       int M5=s.nextInt();
       float total=M1+M2+M3+M4+M5;
       float per=total/500*100;
       System.out.println("Name:"+nm+"\t\t\tRollNo:"+r);
       System.out.println("----------------------------------------------------------------------------------------------------");
       System.out.println("Subject| Database Management\tOperating System\tMathematics\tSoftware Engineerting\tJava");
       System.out.println("----------------------------------------------------------------------------------------------------");
       System.out.println("Marks  | \t\t"+M1+"\t\t"+M2+"\t\t"+M3+"\t\t"+M4+"\t\t\t"+M5);
       System.out.println("----------------------------------------------------------------------------------------------------");
       System.out.println("Total Marks Obtained:"+total);
       System.out.println("Percentage:"+per);
       if(per>90 && per<=100)
        {
             System.out.println("Grade:O");
             System.out.println("Overall Result:Pass");
         }
        else if(per>80 && per<90)
         { 
              System.out.println("Grade:A+");
              System.out.println("Overall Result:Pass");
         }
         else if(per>70 && per<80)
          { 
              System.out.println("Grade:A");
              System.out.println("Overall Result:Pass");

           }
          else if(per>60 && per<70)
           {
              System.out.println("Grade:B+");
              System.out.println("Overall Result:Pass");

            }
          else if(per>50 && per<60)
           {
              System.out.println("Grade:B");
              System.out.println("Overall Result:Pass");

            }
           else if(per>=40 && per<50)
            {
               System.out.println("Grade:c");
               System.out.println("Overall Result:Pass");

             }
            else
             {
                System.out.println("Grade:NA");
                System.out.println("Overall Result:Fail");

              }
      }
}


   
