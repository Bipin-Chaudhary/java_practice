/*Roy wanted to increase his typing speed for programming contests. His friend suggested that he type the sentence "The quick brown fox jumps over the lazy dog" repeatedly. This sentence is known as a pangram because it contains every letter of the alphabet.

After typing the sentence several times, Roy became bored with it so he started to look for other pangrams.

Given a sentence, determine whether it is a pangram. Ignore case.

Function Description

Complete the function pangrams in the editor below. It should return the string pangram if the input string is a pangram. Otherwise, it should return not pangram.

pangrams has the following parameter(s):

s: a string to test
Input Format

Input consists of a string .

Constraints


Each character of , 

Output Format

Output a line containing pangram if  is a pangram, otherwise output not pangram.

Sample Input 0

We promptly judged antique ivory buckles for the next prize

Sample Output 0

pangram

Sample Explanation 0

All of the letters of the alphabet are present in the string.

Sample Input 1

We promptly judged antique ivory buckles for the prize

Sample Output 1

not pangram

Sample Explanation 0

The string lacks an x.*/
package string;

public class Pangrams {

	public static void main(String[] args) {
		
		String s = "We promptly judged antique ivory buckles for the prize";
		String abc = "abcdefghijklmnopqrstuvwxyz";
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		long len = s.length();
		int len2 = abc.length();
	//	int len3 = a.length();
		
		int i=0;
		int j=0;
		
		 
		while(i<len)
		{
			if(s.charAt(i)==abc.charAt(j))
			{
				
				j++;
				i=0;
				if(j==len2)
				{
					break;
				}
				
			}
			else if(s.charAt(i)==a.charAt(j))
			{
				j++;
				i=0;
				if(j==len2)
				{
					break;
				}
			}
			else
			{
				i++;
			}
		}
		
		
		if(j==len2)
		{
			System.out.println("pangrams");
		}
		else
		{
			System.out.println("not pangrams");
		}
		
		
	}

}
