//anagram program with single array

package algorithms;

public class Anagram2 {

	public static void main(String[] args) {
		
		String s1 = "cba";
		String s2 = "cbas";
		boolean isAnagram=true;

		
		int[] a1 = new int[256];
//		int[] a2 = new int[256];
		
		for(int i=0;i<s1.length();i++)
		{
			int index = s1.charAt(i);
			a1[index]++;
		}
		
		for(int i=0;i<s2.length();i++)
		{
			int index = s2.charAt(i);
			a1[index]--;
		}
		
		for(int i=0;i<256;i++)
		{
			if(a1[i]!=0)
			{
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
