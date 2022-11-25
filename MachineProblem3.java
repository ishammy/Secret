import java.util.Scanner;

public class MachineProblem3 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in); 
		String input1 = scan.nextLine(); 
		String input2 = scan.nextLine(); 
		
		int spaces = 0;
		int num1, num2, answer;  
		try { 
			num1 = Integer.parseInt(input1);
			num2 = Integer.parseInt(input2);
		}catch(Exception e) {return;}
		
		answer = num1 + num2;
		if(input1.length() > input2.length()) {
			
			spaces = input1.length() - input2.length();
			
			System.out.println("  " + num1);
			for(int i = 0; i < spaces; i++) {
				System.out.print(" ");
			}
			System.out.println("+ " + num2);
			System.out.println("-------");
			System.out.println("  " +answer);
			
		} else if (input1.length() < input2.length()) {
			spaces = input2.length() - input1.length();
	
			
			for(int i = 0; i < spaces; i++) {
				System.out.print(" ");
			}
			System.out.println("  " + num1);
			System.out.println("+ " +num2);
			System.out.println("-------");
			System.out.println("  " +answer);
		} else {
			System.out.println("  " + num1);
			System.out.println("+ " +num2);
			System.out.println("-------");
			System.out.println("  " +answer);
		}

		
	}
}
