package oopChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class InstanceOfTutorial {

	static String count(ArrayList myList) {
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < myList.size(); i++) {
			Object element = myList.get(i);
			if (element instanceof Student) {
				a++;
			}
			if (element instanceof Rockstar) {
				b++;
			}
			if (element instanceof Hacker) {
				c++;
			}
		}
		String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
		return ret;
	}
	
	public static void main(String []args){
	      ArrayList mylist = new ArrayList();
	      Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      for(int i=0; i<t; i++){
	         String s=sc.next();
	         if(s.equals("Student"))mylist.add(new Student());
	         if(s.equals("Rockstar"))mylist.add(new Rockstar());
	         if(s.equals("Hacker"))mylist.add(new Hacker());
	      }
	      System.out.println(count(mylist));
	   }

}

class Student{}

class Rockstar{   }

class Hacker{}