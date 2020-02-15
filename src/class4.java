public class class4
{
	public static Class3 call;
	
	public void class4()
	{
		call=new Class3();
	}
	
	public static void main(String args[])
	{
		//Calling Addition Method
		int sum=call.addition(10, 20);
		int sub1=call.sub(40, 35);
		System.out.println("Addition is : " + sum);
		System.out.println("Addition is : " + sub1);
	}
}
