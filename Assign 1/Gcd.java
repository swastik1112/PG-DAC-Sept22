import java.util.Scanner;

class Gcd

{

    public static void main(String args[])
	
{
   
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a first no.");
	int a=s.nextInt();
	System.out.println("Enter a second no.");
	int b=s.nextInt();
	System.out.println();
	if(a==b)
	{
	System.out.println("G.C.D= ");
	}
	if(a>b)
	{
	a=a-b;
	System.out.println("gcd= "+a);
	}
	
	else
	{
	b=b-a;
	System.out.println("gcd= "+b);
	}
	}
	}
	