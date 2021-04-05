public class Ex2 {
	public static void main(String[] args) {
	
		String[] names = {"Ani", "AnIl", "KuMar" ,"ANilKu", "Anil KuMar" , "KumAr Anil" ,"AnilKUmar"};
		
		boolean nameMatched = false;
		for(int i=0; i<names.length; i++)
		{
			String capNames=names[i].toUpperCase();
			if(capNames.equals("ANIL KUMAR"))
			{
				System.out.println("Name : " +names[i]+" matched");
				nameMatched = true;
			}
			else
			{
				System.out.println("Name : " +names[i]+ " not matched");
				nameMatched=false;
			}
		
			if(nameMatched==true)
			{
				System.out.println("Position of name matched is : " + i);
			}
		}
	}
}
