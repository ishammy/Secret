import java.util.Scanner;

public class MachineProblem2 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine(); 
		int seconds, minutes, hours; 
		while(true) {
			try {
				seconds = Integer.parseInt(input); 
				break; 
			} catch (Exception e) {System.exit(1);}
		}
		hours = seconds/60;
		minutes = hours%60;
		seconds = seconds%60;
		hours = hours/60;
		
		if(hours != 0) {
			if(minutes != 0) {
				if(seconds != 0) {
					System.out.println(input + " Seconds = " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds" );
				}
				else {
					System.out.println(input + " Seconds = " + hours + " hours, and " + minutes + " minutes" );
				}
			} 
			else {
				if(seconds != 0) {
					System.out.println(input + " Seconds = " + hours + " hours, and " + seconds + " seconds" );
				} else {
					System.out.println(input + " Seconds = " + hours + " hours" );
				}
			}
		} else {
			if(minutes != 0) {
				if (seconds != 0) {
					System.out.println(input + " Seconds = " + minutes + " minutes, and " + seconds + " seconds" );
				} else {
					System.out.println(input + " Seconds = " + minutes + " minutes" );
				}
			} else {
				System.out.println(input + " Seconds = " + seconds + " seconds" );
			}
		}
		
		
	}

}
