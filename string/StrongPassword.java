/*Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

Its length is at least .
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

Note: Here's the set of types of characters in a form you can paste in your solution:

numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"
Input Format

The first line contains an integer  denoting the length of the string.

The second line contains a string consisting of  characters, the password typed by Louise. Each character is either a lowercase/uppercase English alphabet, a digit, or a special character.

Constraints

Output Format

Print a single line containing a single integer denoting the answer to the problem.

Sample Input 0

3
Ab1
Sample Output 0

3
Explanation 0

She can make the password strong by adding  characters, for example, $hk, turning the password into Ab1$hk which is strong.

 characters aren't enough since the length must be at least .

Sample Input 1

11
#HackerRank
Sample Output 1

1
Explanation 1

The password isn't strong, but she can make it strong by adding a single digit.
*/

package string;

public class StrongPassword {

	public static void main(String[] args) {
		
		String pass = "1a";
		int n= pass.length();
		int strong = 0;  //final count//
		int upperCase =0;
		int lowerCase = 0;
		int symbol = 0;
		int number = 0;
		int missing =0;
		String symbols = "!@#$%^&*()-+";
		
				for(int i=0;i<pass.length();i++)
			{
				if(pass.charAt(i)>='A' && pass.charAt(i)<='Z')
				{
					upperCase++;
				}
				
				if(pass.charAt(i)>='a' && pass.charAt(i)<='z')
				{
					lowerCase++;
				}
				
				if(pass.charAt(i)>='0' && pass.charAt(i)<='9')
				{
					number++;
				}
		
				
			}
			
			for(int j=0;j<pass.length();j++)
			{
				for(int k=0;k<symbols.length();k++)
				{
					if(pass.charAt(j)==symbols.charAt(k))
					{
						symbol++;
					}
				}
		
			}
			
			if(upperCase==0)
			{
				strong++;
			}
			if(lowerCase==0)
			{
				strong++;
			}
			if(number==0)
			{
				strong++;
			}
			if(symbol==0)
			{
				strong++;
			}
			
			
		
				
	
		
		
		
		if(strong==0 && n>=6)
		{
			System.out.println(strong);
		}
		else if(strong==0 && n<6)
		{
			missing = 6-n;
			System.out.println(missing);
		}
		
		else if(strong>0 && n>=6)
		{
			System.out.println(strong);
		}
		else if(strong>0 && n<6)
		{
			missing = 6-n;
			if(strong>missing)
			{
				System.out.println(strong);
			}
			else if(strong==missing) 
			{
					System.out.println(strong);
			}
			else {
				
				System.out.println(missing);
			}
			
		}
		
		
		
		
	}

}
