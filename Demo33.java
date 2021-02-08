package TryAndCatchPrograms;

public class Demo33 
{

	public static void main(String[] args)
	{
		System.out.println("hello");
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("this is exception catch block"+e);
		}
		finally
		{
			System.out.println("this is finally block");
		}

	}

}
