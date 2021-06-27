import java.util.Scanner;
public class Vowelorconsonant
{
public static void main(String args[])
{
System.out.println("enter a character :");
Scanner sc =new Scanner(System.in);
char ch = sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' ')
{
System.out.println("Given character is an vowel");
}
else
{
System.out.println("Given character is a consonant");
} 
}
}


output:
enter a character:
e
Given character is an vowel
enter a character:
d
Given character is a consonant



