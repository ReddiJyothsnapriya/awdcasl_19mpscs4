import java.util.Scanner;
public class LargestOfFourNumbers 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter first number: ");
      int number1 = sc.nextInt();
      System.out.println("Please enter second number: ");
      int number2 = sc.nextInt();
      System.out.println("Please enter third number: ");
      int number3 = sc.nextInt();
      System.out.println("Please enter fourth number: ");
      int number4 = sc.nextInt();
      if(number1 > number2)
      {
         if(number1 > number3)
         {
            if(number1 > number4)
            {  
               System.out.println("Largest of four numbers is: " + number1);
            }
            else
            {
               System.out.println("Largest of four numbers is: " + number4);
            }
         }
      }
      else if(number2 > number3)
      {
         if(number2 > number4)
         {
            System.out.println("Largest of four numbers is: " + number2);
         }
         else
         {
            System.out.println("Largest of four numbers is: " + number4);
         }
      }
      else if(number3 > number4)
      {
         System.out.println("Largest of four numbers is: " + number3);
      }
      else
      {
         System.out.println("Largest of four numbers is: " + number4);
      }
      sc.close();
   }
}



Output:

Please enter first number: 10
Please enter second number: 40
Please enter third number: 80
Please enter fourth number: 50
Largest of four numbers is: 80

