import java.util.Scanner;

public class bmicalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight (in kg) and height (in cm): ");
		int w = sc.nextInt();
		int height = sc.nextInt();
		if (height>1 && height>54) {
		int h = height/100;
		double bmi = w /Math.pow(h, 2);
		System.out.println(+bmi);
		
		//categorizing bmi 
		if (bmi<=18.4) {
			System.out.println("Under-weight");
		}
		if (bmi>=18.5 && bmi<24.9) {
			System.out.println("normal");
		}
		if (bmi>=25 && bmi<=39.9) {
			System.out.println("over-weight");
		}
		else System.out.println("obese");
		}
		else System.out.println("Invalid parameters");
		

	}

}
