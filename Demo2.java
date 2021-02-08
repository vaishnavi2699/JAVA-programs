import java.util.Scanner;

public class Demo2 
{

	public static void main(String[] args)
	{
		int i=1,num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter number: "+"\t");
		num=s.nextInt();
		while(i<=num)
		{
			System.out.println(i);
			i++;
		}
		

	}

}
