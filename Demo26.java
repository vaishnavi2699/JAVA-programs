package TryAndCatchPrograms;

public class Demo26 
{
public static void main(String[] args) 
	{
	  System.out.println("hai");
	  try
	  {
		  String str="10/0";
		  int i=Integer.parseInt(str);
		  System.out.println(i);
		 try
		 {
			 int arr[]=new int[5];
			 for(i=0;i<=5;i++)
			 {
				 arr[i]=12;
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("array out of bound exception");
		 }
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  System.out.println("hai vyshnavi");
    }

}
