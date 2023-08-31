package basics;


import java.util.Scanner;


public class LoopsTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double result = 0;
            for(double j = 0; j < n; j++) {
            	double q = Math.pow(2, j) * b;
            	result = j == 0 
            			? a + q 
            			: result + q;
            	System.out.print((int) result + " ");
            }
            System.out.println();
        }
        in.close();
	}

}
