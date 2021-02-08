package TryAndCatchPrograms;

public class Demo19
{

	public static void main(String[] args)
	{
	 System.out.println("hai");
	 try {
		 System.out.println(10/0);
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	 System.out.println("hello");
	 }

}
