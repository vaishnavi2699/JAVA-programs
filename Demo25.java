package TryAndCatchPrograms;

public class Demo25 
{
   public static void main(String[] args)
	{
		System.out.println("hai");
		try
		{
		   System.out.println("abc");
		    try
			{
			  System.out.println(10/0);
			}
			catch(Exception e)
			{
				System.out.println("inner catch");
			}
		} 
		catch(Exception e)
	    {
		System.out.println("outer catch");
		}
		System.out.println("hello");


	}

}
