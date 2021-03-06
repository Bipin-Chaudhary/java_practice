/*We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank. For example, if string  it does contain hackerrank, but  does not. In the second case, the second r is missing. If we reorder the first string as , it no longer contains the subsequence due to ordering.

More formally, let  be the respective indices of h, a, c, k, e, r, r, a, n, k in string . If  is true, then  contains hackerrank.

For each query, print YES on a new line if the string contains hackerrank, otherwise, print NO.

Function Description

Complete the hackerrankInString function in the editor below. It must return YES or NO.

hackerrankInString has the following parameter(s):

s: a string
Input Format

The first line contains an integer , the number of queries.
Each of the next  lines contains a single query string .

Constraints

Output Format

For each query, print YES on a new line if  contains hackerrank, otherwise, print NO.

Sample Input 0

2
hereiamstackerrank
hackerworld
Sample Output 0

YES
NO
Explanation 0

We perform the following  queries:


The characters of hackerrank are bolded in the string above. Because the string contains all the characters in hackerrank in the same exact order as they appear in hackerrank, we print YES on a new line.
 does not contain the last three characters of hackerrank, so we print NO on a new line.
Sample Input 1

2
hhaacckkekraraannk
rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt
Sample Output 1

YES
NO*/

package string;

public class HackerRank {

	public static void main(String[] args) 
	{
		
		String s = "haacckkerrannkk";
		//String s1 = "hackerworld";
		String check = "hackerrank";
		
		int len = check.length();
		int len1 = s.length();
		int j=0;
		
		for(int i=0;i<len1;i++)
		{
			if(s.charAt(i)==check.charAt(j))
			{
				j++;
			}
			
			if(j==len)
			{
//				System.out.println("Yes");
				break;
			}
		}
		
		if(j==len)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("no");
		}
		
		
		
	}

}
