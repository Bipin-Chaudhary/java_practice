package string;

public class CamelCase {

	public static void main(String[] args) {
		
		String s = "bipinAppleArronStone";
		
		int c = 1;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				c++;
			}
		}
		
		System.out.println(c);
		
		

	}

}
