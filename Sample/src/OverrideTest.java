class Override {
	private Object m1() {
		System.out.println("parent");
		return new Object();
	}
}

class Override1 extends Override {
	static void m1() {
		System.out.println("middle class");
	}
	
}

public class OverrideTest extends Override1{

	
	static void m1() {
		System.out.println("parent hgfkgv");
		//return "ranjit";
	}

	public static void main(String[] args) {
		Override1 ov = new OverrideTest();
		ov.m1();
		

		/*
		 * Override ot=new OverrideTest(); System.out.println(ot.m1());
		 * 
		 * OverrideTest otr=(OverrideTest)ot; System.out.println(otr.m1());
		 */

	}
}
