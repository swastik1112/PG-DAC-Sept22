


import java.util.Scanner;

class Q12

{
    public static void main(String args[])
	{
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter a first no.");
		int a=s.nextInt();
		System.out.print("Enter a second no.");
		int b=s.nextInt();
		System.out.println();
		if(b>=0)
		{
		  for(int i=0;i<b;i++)
		{
		 a++;
		}
		System.out.print("the sum of two number is:"+a);
		}
		else
		{
		  for(int i=0;i>b;i--)
		{
		a--;
		}
		System.out.print("the sum of two number is:"+a);
		}
    }
	
}
		