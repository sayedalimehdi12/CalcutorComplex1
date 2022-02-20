package calc;

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		
		public static void main(String[] args) {
		
		String a=input("Enter number ");
		String b= input("Enter number");
		double x= Double.parseDouble(a);
		double y= Double.parseDouble(b);
		String q=input("Enter + - * /");
		try{switch(q) {
		case "+" :
			System.out.println(x+y);
			break;
		case "-" :
			System.out.println(x-y);
			break;
		case "*" :
			System.out.println(x*y);
			break;
		case "/" :
			System.out.println(x/y);
			break;
			default:
				System.out.println("Wrong input");
		}}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	 private  static String input(String prompt) {
		System.out.println(prompt);
		 Scanner s = new Scanner(System.in) ;
			String a= s.nextLine();
			return a;
			
		 
	}

}
