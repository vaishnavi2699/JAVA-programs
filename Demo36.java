package TryAndCatchPrograms;

public class Demo36
{

	public static void main(String[] args) 
	{
		System.out.println("hello");
		  try
		  {
			  try
			  {
				  System.out.println(10/0);
			  }
			  catch(Exception e)
			  {
				  System.out.println("this is inner exception catch block"+e);
			  }
			 String str=null;
				System.out.println(str.length());
		  }
		  catch(Exception e)
		  {
			  System.out.println("this is outer exception catch block"+e);
		  }
		  System.out.println("haii");
		  try
		  {
			 String str="10/0";
			 int i=Integer.parseInt(str);
			 System.out.println(i);
		  }
		  catch(Exception e)
		  {
           System.out.println("Exception catch block"+e);
		  }
		  finally
		  {
			  System.out.println("this is finally block");
		  }
		  System.out.println("abc");
	}

}
