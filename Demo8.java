import java.util.Scanner;

public class Demo8
{

	public static void main(String[] args) 
	{
		int i=1,num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to print even numbers");
		num=s.nextInt();
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
			{
			  System.out.println(i);	
			}
		}
		
		

	}

}
