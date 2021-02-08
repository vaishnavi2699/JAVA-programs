package TryAndCatchPrograms;

public class Demo22
{

	public static void main(String[] args)
	{
	System.out.println("hai");
	try
	{
		String str=null;
		System.out.println(str.length());
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Arithmetic catch block");
	}
	catch(NullPointerException n)
	{
		System.out.println("NullPointer catch block");
	}
	catch(Exception e)
	{
		System.out.println("this is exception catch block");
	}
	System.out.println("hello");
    }

}
