import java.util.Scanner;

class Odd

{

    public static void main(String args[])
	
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a value to be printed ");
	int n=s.nextInt();
	System.out.println();
	int odd=1;
	for(int i=1;i<=n;i++)
	{
	System.out.print(odd+" ");
	odd=odd+2;
    }

}

}