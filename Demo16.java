package TryAndCatchPrograms;

public class Demo16 
{

	public static void main(String[] args) 
	{
		System.out.println("Hai");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		System.out.println("Hai hyberabad");

	}

}
