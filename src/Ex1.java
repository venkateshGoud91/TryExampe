public class Ex1 {
	public static void main(String[] args) {

	String s="Hello my names is Anil Kumar Sheoran. And my contact number is 8008907898";

String reqName= "Anil Kumar Sheoran";
String reqNum= "8008907898";

if(s.contains(reqName))
{
	System.out.println("Name : " + reqName);
}
else
{
	System.out.println("Name not found");
}
 
if(s.contains(reqNum))
{
	System.out.println("contact : " + reqNum);
}
else
{
	System.out.println("Number not found");
}

	}
}
 