/*Sami's spaceship crashed on Mars! She sends a series of SOS messages to Earth for help.

NASA_Mars_Rover.jpg

Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, , determine how many letters of Sami's SOS have been changed by radiation.

For example, Earth receives SOSTOT. Sami's original message was SOSSOS. Two of the message characters were changed in transit.

Function Description

Complete the marsExploration function in the editor below. It should return an integer representing the number of letters changed during transmission.

marsExploration has the following parameter(s):

s: the string as received on Earth
Input Format

There is one line of input: a single string, .

Note: As the original message is just SOS repeated  times, 's length will be a multiple of .

Constraints

 will contain only uppercase English letters, ascii[A-Z].
Output Format

Print the number of letters in Sami's message that were altered by cosmic radiation.

Sample Input 0

SOSSPSSQSSOR
Sample Output 0

3
Explanation 0

 = SOSSPSSQSSOR, and signal length . Sami sent  SOS messages (i.e.: ).

Expected signal: SOSSOSSOSSOS
Recieved signal: SOSSPSSQSSOR
Difference:          X  X   X
We print the number of changed letters.

Sample Input 1

SOSSOT
Sample Output 1

1
Explanation 1

 = SOSSOT, and signal length . Sami sent  SOS messages (i.e.: ).

Expected Signal: SOSSOS     
Received Signal: SOSSOT
Difference:           X
We print the number of changed letters, which is .

Sample Input 2

SOSSOSSOS
Sample Output 2

0
Explanation 2

Since no character is altered, we print 0.*/


package string;

public class SOS {

	public static void main(String[] args) {
		
		String text = "SOS";
		String s = "SOddOSTOD";
		int len = s.length();
		//int mess = len/3;
		int changed = 0;
		
		
		for(int i=0;i<len;i=i+3)
		{
			for(int j=0;j<3;j++)
			{
				
				if(s.charAt(i+j)!=text.charAt(j))
				{
					changed++;
				}
			}
		}
		
		System.out.println(changed);
		

	}

}
