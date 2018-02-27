
public class StringsExample {
	
	public static void main(String[] args)
	{
		String str="abcde party people";
		System.out.println(str.charAt(6));
		System.out.println(str.codePointAt(10));
		System.out.println(str.substring(2, 8));
		System.out.println(str.codePointCount(6, 15));
		System.out.println(str.codePointBefore(17));
		System.out.println(str.compareTo("l"));
		System.out.println(str.length());
		
	}

}
