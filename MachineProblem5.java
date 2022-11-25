import java.util.Scanner;

public class MachineProblem5 {
	public static void main(String[]args) {
		//Change All Questions 
		Scanner scan = new Scanner(System.in); 
		int score = 0; 
		String[][] quiz = {
				{"What does DNA Stand for", "Deoxyribonucleic Acid", "Dont Need to Answer", "Diamond Acid", "Wheee", "Deoxyribonucleic Acid"}, 
				{"How many planets are there in the Solar System", "6", "5", "8", "7", "8"},
				{"What does BIOS mean",  "Basic Integer Output System", "Basic Input/Output System", "Basic Input/Output Scanner", "Basic IO System", "Basic Input/Output System"}, 
				{"Which one is not a Mammal", "Dog", "Cat", "Lizard", "Cow", "Lizard"}, 
				{"Find the odd one out", "Visayas", "Luzon", "Mindanao", "Bulacan", "Bulacan"}, 
				{"How many days are there in a week?", "1", "5", "7", "6", "7"}, 
				{"What language does this program use?", "Kotlin", "Java", "Python", "C++", "Java"},
				{"What does CPU stand for", "Computer", "Central Processing Unit", "Central Processing Utility", "Computer Processor Utility", "Central Processing Unit"}, 
				{"How many hours are there in a day", "24", "22", "42", "21", "24"}, 
				{"What does OS stand for", "Operating System", "Output System", "Original Size", "Operating Unit", "Operating System"}, 
		}; 
		for(int i = 0; i < quiz.length; i++) {
			System.out.println("CURRENT SCORE: " + score);
			System.out.println("-------------------------------------------\n" + quiz[i][0] + "\n-------------------------------------------"); 
			System.out.println("1). " + quiz[i][1]); 
			System.out.println("2). " + quiz[i][2]); 
			System.out.println("3). " + quiz[i][3]); 
			System.out.println("4). " + quiz[i][4]); 
			 
			int choice = 0; 
			while(true) {
				String input = scan.nextLine();
				while(true) {
					try {
						choice = Integer.parseInt(input);
						break;
						
					} catch(Exception e) {System.out.println("Please Enter a Number"); }
					input = scan.nextLine();
				}
				if(choice < 1 || choice > 4) {
					System.out.println("Please Enter a Number from 1 - 4"); 
				} else break; 
			}

			if(quiz[i][choice].equals(quiz[i][5])) { 
				score++; 
			}
		}
		System.out.println("You Have Finished the Quiz!\nScore: " + score + "/10"); 
	} 
}
