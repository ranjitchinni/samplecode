class Parent
{
	public void mary()
	{
		System.out.println("old lady");
	}
	public void property()
	{
		System.out.println("bike");
	}
	
	public void m1()
	{
		System.out.println("parent");
	}
}
public class ChildClass extends Parent{
	public void mary()
	{
		System.out.println("new lady");
	}
	public void property()
	{
		System.out.println("car");
	}
	public void m2()
	{
		System.out.println("child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c=new ChildClass();
		c.property();
		
		c.m1();
		c.m2();
		
		Parent p=new ChildClass();
		
		p.mary();
		p.property();
		
		
	}

}
