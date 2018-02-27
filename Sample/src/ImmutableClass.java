
public final class ImmutableClass {

	final int pannum;
	
	public ImmutableClass(int pannum) {
		super();
		this.pannum = pannum;
		System.out.println(pannum);
	}

	public int getPannum() {
		return pannum;
	}

	/*public void setPannum(int pannum) {
		this.pannum = pannum;
		System.out.println(pannum);
	}*/

	public static void main(String[] args) {
		ImmutableClass ic=new ImmutableClass(20);
		//ic.setPannum(25);
		}

}
