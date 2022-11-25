import java.util.Scanner;

public class MachineProblem1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String input = scan.nextLine(); 
		

		String bra_size = "";
		double bust, band, difference; 
		
		try {
			String[] arr = input.split(" ");
			String input_bust = arr[0];
			String input_band = arr[1];
			band = Double.parseDouble(input_band);
			bust = Double.parseDouble(input_bust);		
		} catch(Exception e) {return;}
		if(bust > 60) {
			bust = bust / 2.54;
			band = band / 2.54;
		}
		
		difference = bust - band; 
		bust = Math.round(bust); 
		 
		if(difference < 0.5) {
			bra_size+="AA"; 
		} else if (difference < 1.5){
			bra_size+="A";
		} else if (difference < 2.5){
			bra_size+="B";
		} else if (difference < 3.5){
			bra_size+="C";
		} else if (difference < 4.5){
			bra_size+="D";
		} else if (difference < 5.5){
			bra_size+="E";
		} else {
			bra_size+="F";
		} 
		System.out.println("Bra Size = " + String.format("%.0f", bust) + bra_size);
	}
}
