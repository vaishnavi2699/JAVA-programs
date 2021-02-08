package TryAndCatchPrograms;

public class Demo27
{

	public static void main(String[] args)
	{
		System.out.println("hai");
		try
		{
			System.out.println("abc");
			try
			{
				String str=null;
				System.out.println(str.length());
			}
			catch(Exception e)
			{
				System.out.println("This is Inner catch block");
			}
		}
		catch(Exception e)
		{
			System.out.println("This is outer catch block");
		}
		System.out.println("hello");

	}

}
