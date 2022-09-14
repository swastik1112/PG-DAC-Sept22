import java.util.Scanner;

class Q8

{
    public static void main(String args[])
	{
	    Scanner s=new Scanner(System.in);
		System.out.print("Enter a no.");
		int a=s.nextInt();
		System.out.println("the digit of entered no.is");
		while(a>0||a<0)
		{
		    if(a<0)
			{
			    System.out.println((a%10)*(-1));
				a=a/10;
			}
			else
		    {
		System.out.println(a%10);
		a=a/10;
		    }
			
		}
	}
	
}