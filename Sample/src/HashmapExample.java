import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
	

	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("e","kiran");
		hm.put("e2","kiran1");
		hm.put("e","kiran2");
		hm.put("e","kiran3");
		
		
		
		HashmapExample he=new HashmapExample();
		for(Map.Entry<String, String> map:hm.entrySet())
		{
			System.out.println(map.getKey()+ " "+map.getValue());
		}
		
	}

}
