package dataStrcutures;

import java.util.Scanner;
import java.util.Stack;

public class StackChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> myStack = new Stack<>();
		while (sc.hasNext()) {
			String input=sc.next();
             myStack.push(input);
		}
		sc.close();
		int roundCounter = 0;
		int boxCounter = 0;
		int curlyCounter = 0;
		while (!myStack.empty()) {
			String topOfStack = myStack.peek();
			if (topOfStack.equals(")") & myStack.search("(") == -1) {
				System.out.println("false1");
				break;
			}  else if (topOfStack.equals(")") & myStack.search("(") != -1) {
				myStack.pop();
				roundCounter++;
			} else if (topOfStack.equals("(") & roundCounter > 0) {
				myStack.pop();
				roundCounter--;
			} else if (topOfStack.equals("(") & roundCounter <= 0) {
				System.out.println("false2");
				break;
			} else if (topOfStack.equals("]") & myStack.search("[") == -1) {
				System.out.println("false3");
				break;
			} else if (topOfStack.equals("]") & myStack.search("[") != -1) {
				myStack.pop();
				boxCounter++;
			} else if (topOfStack.equals("[") & boxCounter > 0) {
				myStack.pop();
				boxCounter--;
			} else if (topOfStack.equals("[") & boxCounter <= 0) {
				System.out.println("false4");
				break;
			} else if (topOfStack.equals("}") & myStack.search("{") == -1) {
				System.out.println("false5");
				break;
			} else if (topOfStack.equals("}") & myStack.search("{") != -1) {
				myStack.pop();
				curlyCounter++;
			} else if (topOfStack.equals("{") & curlyCounter > 0) {
				myStack.pop();
				curlyCounter--;
			} else if (topOfStack.equals("{") & curlyCounter <= 0) {
				System.out.println("false6");
				break;
			} else if(topOfStack.equals("end")) {
				myStack.pop();
			} else {
				break;
			}
		}
		if (myStack.empty()) {
			System.out.println("true");
		}
		
	}
}
