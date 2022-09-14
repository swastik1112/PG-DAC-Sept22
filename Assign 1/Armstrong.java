import java.util.Scanner;

class Armstrong
{
    
    public static void main(String args[]){
		
    int n,arm=0,rem,c;

    Scanner Armstrong= new Scanner (System.in );

    System.out.println("Enter a no.");
    
	n= Armstrong.nextInt();
    c=n;
	while(n>0)
	
   {
    rem=n%10;
   
    arm=(rem*rem*rem)+arm;
	n=n/10;
   
   }
{
if (c==arm)
 System.out.println("Armstrong no.");
 
 else
 
  System.out.println("Not Armstrong no.");
}

}

}

