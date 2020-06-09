package algorithms;

public class Reverse_String {
	
	public static void main(String args[])
	{
		String s = "I love java, the coffee";
		
		String arr[] = s.split(" ");
		
		int n = arr.length;
		//System.out.println(n);

		for(int i=n-1;i>-1;i--)
		{
			System.out.println(arr[i]);
		}
			
		
	}

}
