 
public class Ex3ForEach {

	public static void main(String[] args) {
		String[] names = {"Ani", "AnIl", "KuMar" ,"ANilKu", "Anil KuMar" , "KumAr Anil" ,"AnilKUmar"};

		String n= "Anil kumar";
			
			for(String i : names)
			{
				if(n.toUpperCase().equals(i.toUpperCase()))
				{
					System.out.println(i + " Match found");
				}
				else
				{
					System.out.println(i + " match not found");
				}
			}
	  }
}
