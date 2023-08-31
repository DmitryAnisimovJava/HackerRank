package basics;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StatickInitializerBlock {
	
	static {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			int B = Integer.parseInt(bf.readLine().trim());
			int H = Integer.parseInt(bf.readLine().trim());
			if (B <= 0 || H <= 0) {
				throw new Exception("java.lang.Exception: ");
			} else {
				System.out.println(B * H);
			}
		} catch (IOException e) {
			try {
				bf.close();
			} catch (Exception e2) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage() + "Breadth and height must be positive");
		}
		
	}

	public static void main(String[] args) {
	
	}
}
