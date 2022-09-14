import java.util.Scanner;

class Q13

{

     public static void main(String args[])
	 {
	    Scanner s=new Scanner(System.in);
		System.out.print("enter a no. ");
		int a=s.nextInt();
		if(a<0)
		{
		System.out.println("enter a no. is possitive no.");
		}
		else
		{
	    System.out.println("the reverse of enter no. is");
	    while(a>0)	
		{	 
		System.out.print(a%10);
		a=a/10;
	}
	
}

}

}