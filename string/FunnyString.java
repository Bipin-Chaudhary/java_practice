/*In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, create a copy of the string in reverse e.g. . Iterating through each string, compare the absolute difference in the ascii values of the characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is the same for both strings, they are funny.

Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.

For example, given the string , the ordinal values of the charcters are .  and the ordinals are . The absolute differences of the adjacent elements for both strings are , so the answer is Funny.

Function Description

Complete the funnyString function in the editor below. For each test case, it should return a string, either Funny or Not Funny.

funnyString has the following parameter(s):

s: a string to test
Input Format

The first line contains an integer , the number of queries.
The next  lines each contain a string, .

Constraints

Output Format

For each string  print whether it is Funny or Not Funny on a new line.

Sample Input

2
acxz
bcxz
Sample Output

Funny
Not Funny
Explanation

You can use  to store the reverse of .

Test Case 0:

, 
Corresponding ASCII values of characters of the strings:
 and 
For both the strings the adjacent difference list is [2, 21, 2] so we print Funny.

Test Case 1:

, 
Corresponding ASCII values of characters of the strings:
 and 
The adjacent difference list for string  is [1, 21, 2] and for string  it is [2, 21, 1]. Since they are not the same we print Not Funny.*/

package string;

//import java.util.ArrayList;

public class FunnyString {

	public static void main(String[] args) 
	{
//		String s = "bcxz";
//		int len = s.length();
		
//		char[] s1 = s.toCharArray();
//		char[] r = new char[len];
//		
//		int[] x = new int[len];
//		int[] y = new int[len];
//		
//		int j=len;
//		for(int i=0;i<len;i++)
//		{
//			r[j-1] = s1[i];
//			
//			j=j-1;
//		}
//		
//		for(int i=0;i<len-1;i++)
//		{
//			x[i] = s1[i+1]-s1[i];
//			y[i] = r[i]-r[i+1];
//			
//			
//			
//		}
//		
//		boolean flag = true;
//		
//		for(int i=0;i<len;i++)
//		{
//			if(x[i]!=y[i])
//			{
//				flag = false;
//				break;
//			}
//		}
//	
//		if(flag==false)
//		{
//			System.out.println("not funny");
//		}
//		else
//		{
//			System.out.println("funny");
//		}
//		
		
		
		String s = "lmnop";
		
		int len = s.length();
		
		
		String rev = "";
		
	//	int j=len;
		for(int i=len-1;i>-1;i--)
		{
			rev = rev + s.charAt(i);
		}
		
		
		
		
		boolean flag =true;
		
		for(int i=0;i<len-1;i++)
		{
			int a = Math.abs(s.charAt(i)-s.charAt(i+1));
			int b = Math.abs(rev.charAt(i)-rev.charAt(i+1));
			
			if(a!=b)
			{
				
				flag =false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("funny");
		}
		else {
			System.out.println("not funny");
		}
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
