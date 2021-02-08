package TryAndCatchPrograms;

public class Demo21 
{

	public static void main(String[] args) 
	{
		System.out.println("hello");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("This is Arithmetic Catch block");
		}
		catch(NullPointerException n) {
			System.out.println("this is null pointer exception");
		}
		catch(Exception e)
		{
			System.out.println("this is Exception catch block");
		}
		System.out.println("hai");

	}

}
