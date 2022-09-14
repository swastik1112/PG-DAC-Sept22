import java.util.Scanner;

class Lcm
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter a first no.");
	int x=sc.nextInt();
	System.out.print("enter a second no.");
	int y=sc.nextInt();
	int i;
	int a=(x>y)?x:y;
	for(i=a;i<=x*y;i=i+a)
	{
	   if(i%x==0&&i%y==0)
	
	   {
	System.out.println("LCM of "+x+" and "+y+" is:"+i);
	break;
}

}

}
	
}

	
	 //break;
	