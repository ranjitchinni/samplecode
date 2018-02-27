
public class AllSample {
	public static void main(String[] args) {
	int i1=0,i2=1,i3,i,count=10;
	
		
		System.out.println(i1+ " "+i2);
		
		for(i=2;i<count;++i)
		{
			i3=i1+i2;
			System.out.println(" "+i3);
			i1=i2;
			i2=i3;
			
		}
	}

}
