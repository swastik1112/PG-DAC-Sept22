import java.util.Scanner;

class Swap

{

    public static void main(String args[])
	
{
 
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a first no.");
	int a=s.nextInt();
	System.out.println("Enter a second no.");
	int b=s.nextInt();
	System.out.println();
	a=a+b;
	b=a-b;
	a=a-b;
	
	
	System.out.println("After swap");
	System.out.println();
	System.out.println("first no.is:"+a);
	System.out.println("second no.is:"+b);
	
}
	
	
}