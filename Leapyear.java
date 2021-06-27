import java.util.Scanner;
public class Leapyear
{
public static void main(String args[])
{
int y;
System.out.println("enter an year");
Scanner sc= new Scanner(System.in);
y=sc.nextInt();
if (((y % 4==0) && (y % 100!=0)) || (y % 400==0))
System.out.println("specified year is a leap year");
else
System.out.println("specified year is not a leap year");
}
}


output 1:
enter an year
2020
specifid year is a leap year

output 2:
enter a year
2019
specified year is not a leap year
