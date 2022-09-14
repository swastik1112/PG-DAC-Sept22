import java.util.Scanner;

class Q9

{
    public static void main(String args[])
	{
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter a no.");
		int a=s.nextInt();
		int n=1;
		if (a<=0)
		{
		System.out.println("enter a possitive no.is");
		}
		else
		{
		System.out.println("the factors of given no. is ");
		while(n<=a)
		{
		if(a%n==0)
		{
		System.out.println(n);
		}
		n++;
		}
		
	}
}
	
}