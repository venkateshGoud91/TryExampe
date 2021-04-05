public class Ex4 
{
	public static void main(String[] args) 
	{
		/* Note: name and number might change
			Extract and print the name and number 
			Expected o/p: Name: Anil Kumar Sheoran
			Contact: 8008907898
		 */
		
		String s ="Hello my name is 'Anil Kumar Sheoran' and '8008907898' is my contact number.";
		String s1[] =s.split("and", 3);	
	
		int n1 = s1[0].indexOf("'")+1;
		int n2 = s1[0].trim().length()-1;
		System.out.println("Name: " +s1[0].substring(n1, n2));
	
		String n3 = s1[1].trim();
		System.out.println("Contact: " + n3.substring(1, 11));	
	}
}
