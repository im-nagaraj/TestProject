package setOfCharInString;

import java.util.Scanner;

public class SetOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "My name is nagaraj";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a keyword");
//		String st = sc.nextLine();
//		
//		if(str.contains("Nagaraj")) {
//			System.out.println("The keyword "+st+":"+"is found in given String");
//		}
//		else {
//			System.out.println("The keyword "+st+":"+"is found in given String");
//		}
//
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str1 = sc.nextLine();
		
        // In If-else statements you can use the contains() method

        if (str1.contains("Example01")) {
            System.out.println("The Keyword :example: is found in given string");
        } else {
            System.out.println("The Keyword :example: is not found in the string");
        }
        
       
      
	}

}
