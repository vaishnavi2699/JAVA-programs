package TryAndCatchPrograms;

public class Demo29 
{

	public static void main(String[] args) 
	{
		System.out.println("hai");
		try
		{
			try
			{
				String str=null;
				System.out.println(str.length());
			}
			catch(Exception e)
			{
				System.out.println("Inner Catch Block"+e);
			}
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("Outer Catch Block"+e);
		}
		System.out.println("Hello");

	}

}
