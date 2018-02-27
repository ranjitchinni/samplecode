class Parent1{
	void mary()
	{
		System.out.println("parent");
	}
	
	void bike()
	{
		System.out.println("hero");
	}
}
public class OverrideExm extends Parent1 {
	
	void mary()
	{
		System.out.println("child");
	}
	void bike()
	{
		System.out.println("apache");
	}
	public static void main(String[] args)
	{
		Parent1 child=new OverrideExm();
		child.bike();
		
		int sum=0;
		for(int i=0;i<100;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
}
