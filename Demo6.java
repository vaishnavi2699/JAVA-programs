import java.util.Scanner;
class D
{
	
	public void Strong()
	{
		int num,rem,fact=1,sum=0,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to check strong number or not");
		num=s.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			while(rem>=1)
			{
				fact=fact*rem;
				rem--;
			}
		sum=sum+fact;
		fact=1;
		num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println(" not a Strong number");
		}
	}
}
class C extends D
{
	public void perfect()
	{
		int i=1,num,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check perfect number or not");
		num=s.nextInt();
		for(i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println(" not a Perfect number");
		}
		
	}
}
public class Demo6 
{

	public static void main(String[] args)
	{
	    C sp=new C();
	    sp.Strong();
	    sp.perfect();
	   
	    

	}

}
