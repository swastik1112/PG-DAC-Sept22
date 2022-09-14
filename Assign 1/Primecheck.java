import java.util.Scanner;

class Primecheck
{
    
    public static void main(String args[]){
		
     
	 
    Scanner Primecheck= new Scanner (System.in);

    System.out.println("Enter a no");
    
	int b= Primecheck.nextInt();
	
	int a, c=0;
	
	for(a=1;a<=b;a++)
		
	
	    {
		
		if(b%a==0)
			
			{
				c++;
	
			}
			
	    }	
		
       if (c==1)
	   {   
       System.out.println( " prime no " );
    }
	
    else
	 
	{
	 
       System.out.println( " not prime no " );
	}
  
  }
  
}