package TryAndCatchPrograms;

public class Demo28 
{

	public static void main(String[] args) 
	{
		System.out.println("hai");
		try
		{
			System.out.println("abc");
			try
			{
			  String str="10/0";
			  int i=Integer.parseInt(str);
			  System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("hello");
	

	}

}
