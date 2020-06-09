/*Given an integer array A of size N, find sum of elements in it.

Input:
First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines of input. First line contains N the size of the array A. The second line contains the elements of the array.

Output:
For each testcase, print the sum of all elements of the array in separate line.

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= Ai <= 100

Example:
Input:
2
3
3 2 1
4
1 2 3 4
Output:
6
10
*/


package solved_problems;
import java.util.*;

public class SumOfArray 
{

		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int test_case,array_size,sum=0;
			
			System.out.print("enter test cases:");
			test_case = sc.nextInt();
			
			for(int i=1;i<=test_case;i++)
			{
				System.out.print("enter array size:");
				array_size = sc.nextInt();
				sc.nextLine();
			
				//int[] arr = new int[array_size];
				System.out.println("enter array elements");
				String s = sc.nextLine();
				int[] arr2 = new int[array_size];
				String[] arr = s.split(" ");
				int j=0;
				sum=0;
				for(String items : arr)
				{
					arr2[j] = Integer.parseInt(items);
					sum = sum + arr2[j];
					j++;
				}
				
				
				System.out.println(sum);
				
			}
			
			
			
			
			sc.close();
		}
	
}
