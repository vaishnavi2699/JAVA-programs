package TryAndCatchPrograms;

public class Demo35 
{

	public static void main(String[] args) 
	{
	  System.out.println("hello");
	  try
	  {
		  int i=0;
		  int arr[]=new int[5];
		  for(i=0;i<=5;i++)
		  {
			  arr[i]=23;
		  }
		  try
		  {
			  System.out.println("xyz");
		  }
		  catch(Exception e)
		  {
			  System.out.println("this is inner exception catch block"+e);
		  }
	  }
	  catch(Exception e)
	  {
		  System.out.println("this is outer exception catch block"+e);
	  }
	  finally
	  {
		  System.out.println("this is finally block");
	  }
	  System.out.println("haii");

	}

}
