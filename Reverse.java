import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
  System.out.println("Enter any String");
  String name=sc.nextLine();
 String reversedString="";
 if(name=="") {
	 throw new NullPointerException();
 }
  for(int i=name.length()-1;i>=0;i--) {
	  reversedString+=name.charAt(i);
  }
  System.out.println("reversed String:"+reversedString);
  }
 
  catch(NullPointerException e) {
  e.printStackTrace();
  }
  catch (StringIndexOutOfBoundsException e) {
	  System.out.println(e.getMessage());
  }
	}

}
