package Liu_P2;
import java.util.Scanner;

public class BMI_Evaluation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			double standard;
			double metric;
			double weight;
			double height;
			int opt;

			System.out.print ("Enter your weight in pounds or kilograms: ");
			weight = sc.nextDouble();
			
			System.out.println("Enter your height In inches or meters: ");
			height = sc.nextDouble();
			
			System.out.println("If standard system, please enter 1.");
			System.out.println("If metric system, please enter 2.");
			opt = sc.nextInt();

			if (opt == 1)
			{
				standard = (weight * 703) / (height * height);
				System.out.printf("Your Body Mass Index Is: %f\n", standard);
			}

			if (opt == 2)
			{
				metric = (weight) / (height * height);
				System.out.printf("Your Body Mass Index is: %f\n", metric);
			}


			System.out.println("BMI Categories:");
			System.out.println("Underweight = < 18.5");
			System.out.println("Normal weight = 18.5 – 24.9");
			System.out.println("Overweight = 25 – 29.9");
			System.out.println("Obesity = BMI of 30 or greater");

	}

}
