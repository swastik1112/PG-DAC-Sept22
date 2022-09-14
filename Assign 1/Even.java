import java.util.Scanner;

class Even

{

    public static void main(String args[])
	
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a value to be printed ");
	int n=s.nextInt();
	System.out.println();
	int eve=2;
	for(int i=1;i<=n;i++)
	{
	System.out.print(eve+" ");
	eve=eve+2;
    }

}

}

