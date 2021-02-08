import java.util.Scanner;
public class Demo4 
{

	public static void main(String[] args) 
	{
	  int i=1,num;
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter number to print odd digits");
	  num=s.nextInt();
	  for(i=1;i<=num;i++)
	  {
		  if(i%2!=0)
		  {
			  System.out.print(i+"\t");
		  }
	  }
	  

	}

}
