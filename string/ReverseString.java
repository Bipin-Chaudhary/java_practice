package string;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String s = "  Hello world  ";
		int len = s.length();
		int i=len-1;
		int j=0;
	
		String s1 =	s.trim();
		
		String s2 = "";
		
		j=i;
		
		while(i>0)
		{
			
			if(s1.charAt(i)==' ')
			{
				i--;
			}
			else if(s1.charAt(i)!=' ')
			{
				s2 = s2.concat(s1.substring(i+1, j+1));
				System.out.println(s2);
			}
		}

	}

}
