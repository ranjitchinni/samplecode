
public class StringPalindrome {
	
	 
	/*
	 * String str="MADAM"; String reverse = "";
	 * 
	 * for(int i=str.length()-1;i>=0;i--) { reverse +=str.charAt(i); }
	 * System.out.println(reverse); }
	 */
	/*
	 * int r,sum=0,temp; int n=454;
	 * 
	 * 
	 * temp=n; while(n>0) { r=n%10; System.out.println(r); sum=(sum*10)+r;
	 * System.out.println(sum); n=n/10; System.out.println(n); } if(temp==sum)
	 * System.out.println("palin"); else System.out.println("not palin");
	 */

	

	/*	String str = "ranjitranjit";
		int distinct = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j =0;j< str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					distinct++;
					//System.out.println(distinct);
				}

			}
			System.out.println(str.charAt(i)+"    "+distinct);
			String s=str.valueOf(str.charAt(i));
			//System.out.println(s);
			str=str.replaceAll(s," ");
			distinct=0;
		}

*/
		public static int[] doSelectionSort(int[] arr)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				int index=i;
				for(int j=i+1;j<arr.length-1;j++)
				
					if(arr[j]<arr[index])
						index=j;
					
				
				int smallnumber=arr[index];
				arr[index]=arr[i];
				arr[i]=smallnumber;
				
				
				
				
			}
			return arr;
			
		}
		public static void main(String[] args)
		{
			int[] arr1={45,2,5,98};
			int[] arr2=doSelectionSort(arr1);
			for(int x:arr2)
				
				System.out.println(x);
		}

		}
	
	
	
	
	
	
	
	
	
	
	
	
