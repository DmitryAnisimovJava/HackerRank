package basics;

import static java.lang.Math.rint;

import java.util.Scanner;

public class StdinAndStdout1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOne = sc.nextInt();
		int numberTwo = sc.nextInt();
		int numberThree = sc.nextInt();
		System.out.println(numberOne);
		System.out.println(numberTwo);
		System.out.println(numberThree);
	}

}
