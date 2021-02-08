import java.util.Scanner;

public class Demo7
{

	public static void main(String[] args) 
	{
		int i=1,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		n=s.nextInt();
		while(i<=n)
		{
			System.out.println(n);
			n--;
		}

	}

}
