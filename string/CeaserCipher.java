//ceaser cipher without symbols

package string;

public class CeaserCipher {

	public static void main(String[] args) {
		
		
		String text = "Hello_World!";
		StringBuffer cipher = new StringBuffer();
		int n = text.length();
		int key =4;
		
		for(int i=0;i<n;i++)
		{
			if(Character.isUpperCase(text.charAt(i)))
			{
				
				
					 char ch = (char)(((int)text.charAt(i) + 
                             key - 65) % 26 + 65); 
					  cipher.append(ch);
				
			
			}
				
				
				
			
			else if(Character.isLowerCase(text.charAt(i)))
			{
				
				char ch = (char)(((int)text.charAt(i) + 
                        key - 97) % 26 + 97); 
					cipher.append(ch); 
				
				
			}
			else
			{
				char c = text.charAt(i);
				cipher.append(c);
			}
			
				
			
		}
		
		System.out.println(cipher);
		
		
		
		
		

	}

}
