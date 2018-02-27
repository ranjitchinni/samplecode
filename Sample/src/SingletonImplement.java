class SingletonBillPugh{
	
	private SingletonBillPugh()
	{
		System.out.println("main class");
	}
	
	private static class SingletonHelper{
		private static final SingletonBillPugh instance=new SingletonBillPugh();
		//System.out.println(instance);
	}

	
	public static SingletonBillPugh instanceMethod()
	{
		return SingletonHelper.instance;
	}
}

public class SingletonImplement {
	

	public static void main(String[] args) {

		SingletonBillPugh sbp=SingletonBillPugh.instanceMethod();
		System.out.println(sbp);
		System.out.println(sbp.instanceMethod());
		//sbp.instanceMethod();
	}

}
