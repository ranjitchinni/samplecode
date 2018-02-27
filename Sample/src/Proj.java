
public class Proj {

	public static void main(String[] args) {
	
		String s=new String("java");
		String s1=new String("java");
		
		String s3="java";
		String s4="java";
		
		if(s==s1)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
	}

}
