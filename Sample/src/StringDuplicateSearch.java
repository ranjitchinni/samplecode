import java.util.Arrays;

public class StringDuplicateSearch {
	public static void main(String[] args) {

		String[] s1 = { "abdabc", "abcabc", "fuck", "fuck", "def", "def" };

		
		for (int i = 0; i < s1.length; i++) {
			int count = 1;
			for (int j = i+1; j < s1.length; j++) {
				if (s1[i]==(s1[j])) {
					count++;
					s1[j] = null;
				}
			}
			if (s1[i] == null)
				
			continue;
		
		System.out.println(s1[i]+ " "+ count);
	}
		}
}