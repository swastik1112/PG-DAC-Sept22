import java.util.Scanner;

class Q7
{
    public static void main(String args[])
    {
	int n=0;
      System.out.println("The numbers without using loop have been printed below");
      print_without_loop(n);
   }
	public static void print_without_loop(int n){
      if(n<=10){
         System.out.println(n+" ");
         print_without_loop(n+1);
      }
		
}

}









/*int n;
	n=1;
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	if(n<=10)
	System.out.println( "n+1");
	n++;

	*/