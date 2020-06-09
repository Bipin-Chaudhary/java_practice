package string;
import java.util.ArrayList;

public class AlternatingChar {

	public static void main(String[] args) {
		
		String s = "AAABBB";
		//String s = "AAAA";
		char[] x = s.toCharArray();
		int len = s.length();
		int del =0;
		
		
		
		
		//ArrayList<Character> c = new ArrayList<Character>();
		
//		for(char items : x)
//		{
//			c.add(items);
//			
//		}
//		
		
		for(int i=0;i<len-1;i++)
		{
			if(x[i]==x[i+1])
			{
				
				del++;
//				for(int j=i+1;j<len-1;j++)
//				{
//					x[j] = x[j+1];
//				}
			}
//			else
//			{
//				i++;
//			}
		}
		
		System.out.println(del);

	}

}
