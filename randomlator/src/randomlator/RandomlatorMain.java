package randomlator;
import java.util.Scanner;

public class RandomlatorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a, b;
		System.out.println("Erste zahl: ");
		a = read.nextInt();
		System.out.println("Zweite Zahl: ");
		b = read.nextInt();
		read.close();
		Randomlate random = new Randomlate(a, b);
		System.out.println(random.calculate());
		
		

	}

}

