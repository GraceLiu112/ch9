import java.util.Arrays;
import java.util.Scanner;
public class Stats{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
		System.out.print("input a sentence: ");
		String sentence1 = in.nextLine();
		System.out.println(sentence1.indexOf("x "));
		int[] array = {10, -3, 55, 0, 14};
		int max = array[0];        // smallest possible int
		for (String arg : args) {
			int value = Integer.parseInt(arg);  // string → int
			if (value > max) max = value;
			}
		System.out.println("The max is " + max);


    }
}
