package Liu_P1;
import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		 	int i, t;
	        int len = 4;
	        int [] original = new int [len];
	        int [] newNum = new int [len];
	        
	        System.out.println("Enter a 4-Digit integer: "); // With spaces in between each one, example:(1 2 3 4).
	        
	        for (i = 0; i < original.length; i++)
	        {
	            original[i] = scnr.nextInt();
	        }
	        for (i = 0; i < original.length; i++)
	        {
	            newNum[i] = (original[i] + 7) % 10;
	        }
	        
	        t = newNum[0];
	        newNum[0] = newNum[2];
	        newNum[2] = t;
	        t = newNum[1];
	        newNum[1] = newNum[3];
	        newNum[3] = t;

	        System.out.print("Your encrypted integers is: ");

	        for (i = 0; i < newNum.length; i++)
	        {
	            System.out.print(newNum[i]);
	        }
	}
}
