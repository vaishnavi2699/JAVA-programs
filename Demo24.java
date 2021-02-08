package TryAndCatchPrograms;

public class Demo24 
{

	public static void main(String[] args) 
	{
	System.out.println("hai");
	try
	{
		System.out.println("ABC");
		System.out.println(10/0);
		System.out.println("xyz");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("hello");
    }

}
