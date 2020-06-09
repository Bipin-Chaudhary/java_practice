package algorithms;

public class Anagrams {

	public static void main(String[] args) {
		
		String s1 = "bac";
		String s2 = "cab";
		
		boolean isAnagram=false;
		boolean [] visited= new boolean[s2.length()];
		
	if(s1.length()==s2.length())
	{
		
	
		
		for(int i=0;i<s1.length();i++)
		{
			isAnagram = false;
			
			for(int j=0;j<s2.length();j++)
			{
				if((s1.charAt(i)==s2.charAt(j)) && !visited[j] )
				{
					visited[j]=true;
					isAnagram = true;
					break;
				}
			}
			
			if(!isAnagram)
			{
				break;
			}
			
		}
		
		
		
	  }
	
	
	if(isAnagram)
		{
			System.out.println("anagram!");
		}
		else
		{
			System.out.println("not anagram");
		}

	
	
	
	}
	
	
}
