package string;

public class String1 {

	public static void main(String args[])
	{
										//String functions
		
		String name = "Arron"; //by literals , stores in string pool and gets reused
		
		String name2 = new String("Bipin"); //by new object, creates new string object in heap and string pool
		
		System.out.println("string comparison: "+ name==name2); //false checks reference
		
		name = "Bipin";
		
		String name3 = "";
		
		System.out.println(name.equals(name2)); //.equals function ,checks values
		
		
		System.out.printf("upper case %s and lowercase %s \n",name.toUpperCase(),name.toLowerCase());
		
		System.out.println("character positoon: "+ name.charAt(2));
		System.out.println("character index value:"+ name.indexOf('i'));
		
		System.out.println("length of string: "+ name.length());
		
		System.out.println("substring:"+ name.substring(1));
		
		System.out.println("substring with two paramteres: "+name.substring(1,3));
		
		System.out.println("checks for empty string: "+ name3.isEmpty());
		
		System.out.println("concatination: "+ name3.concat("iron man"));
		
		name3 = "spider man";
		System.out.println(name3);
		String name4 = name3.replace("spider", "iron");
		System.out.println("replace function :"+ name4);
		
		//split function
		
		String name5 = "bipin%iron-man%spiderman%thor%black-widow";
		
		String[] name6 = name5.split("%");
		
		for(String items: name6)
		{
			System.out.println(items);
		}
		
		String name7 = "    bipin    ";
		System.out.println("trim function:"+name7.trim());
		
		
	}
}
