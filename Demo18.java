package TryAndCatchPrograms;

public class Demo18 
{

	public static void main(String[] args)
	{
		System.out.println("Hai");
		try {
		System.out.println(10/2);	
		}
		catch(ArithmeticException ae)
		{
			System.out.println("This is catch block");
		}
		System.out.println("Hello");
		

	}

}
