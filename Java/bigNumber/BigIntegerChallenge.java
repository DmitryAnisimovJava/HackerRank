package bigNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntegerChallenge {


	public static void main(String[] args) {
		BufferedReader inBufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			BigInteger firstBigInt = new BigInteger(inBufferedReader.readLine().trim());
			BigInteger secondBigInt = new BigInteger(inBufferedReader.readLine().trim());
			BigInteger sum = firstBigInt.add(secondBigInt);
			BigInteger multiplyResultBigInteger = firstBigInt.multiply(secondBigInt);
			System.out.println(sum);
			System.out.println(multiplyResultBigInteger);
		} catch (IOException e) {
			System.out.println("Wrong input");
			e.printStackTrace();
		} finally {
			try {
				inBufferedReader.close();
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			} 
		}
	}

}
