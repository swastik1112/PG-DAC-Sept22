import java.util.Scanner;

class Leapyear
{
public static void main(String args[])
{

Scanner LP= new Scanner (System.in );

System.out.println("Enter a no.");

 int year = LP.nextInt();
 
 if (year%4==0||year%400==0||year%100==0)
{
System.out.println("leap year");
}
else
{
System.out.println("Not leap year");
}
}
}


