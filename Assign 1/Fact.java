/*import java.util.Scanner;




class Fact

{

    public static void main(String args[])
	
{
    int num,i;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a no. to find a factorial");
	int Num=s.nextInt();
	int fact=1;
	num=1;
	i=1;
	
	while(i<=num)
	
	{
	     fact=fact*i;
		 i++;
	}
	System.out.println("factorial of "+i+" is "+fact);
	
}

}
*/





 import java.util.Scanner;

class Fact

{

    public static void main(String args[])
	
{
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a no. to find a factorial");
	int a=s.nextInt();
	int fact=1;
	n=1;
	
	while(n<=a)
	
	{
	     fact=fact*n;
		 n++;
	}
	System.out.println("factorial of "+a+" is "+fact);
	
}

}