class A
{
	public void add()
	{
		int a=20,b=20,c;
		c=a+b;
		System.out.println("Addition is: "+c);;
	}
}
class B extends A
{
	public void sub()
	{
		int a=20,b=10,c;
		c=a-b;
		System.out.println("Subtraction is: "+c);
	}
}
public class Demo5
{

	public static void main(String[] args) 
	{
		B as=new B();
		as.add();
		as.sub();
		

	}

}
