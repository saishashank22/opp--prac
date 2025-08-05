package Stringmethods;
import java.util.Scanner;
public class Stringmethods {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String input =s.nextLine();
		System.out.println("Character at position :"+input.charAt(1));
		System.out.println("Length of string :"+input.length());
		System.out.println("String in uppercase :"+input.toUpperCase());
		System.out.println("String in lowercase :"+input.toLowerCase());
		System.out.println("Substring from index 2 to 6:"+input.substring(2,6));
		System.out.println("Enter the word");
		String searchWord=s.nextLine();
		if(input.contains(searchWord)) {
			System.out.println("the string contains'"+searchWord+"'");
		}else {
			System.out.println("The string doesnot contain'"+searchWord+"'");
		}
		s.close();
		
	}

}
