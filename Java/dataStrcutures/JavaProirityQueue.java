package dataStrcutures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JavaProirityQueue {

	private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Student {
	
	private int id;
	private String name;
	private double cgpa;
	
	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCGPA() {
		return cgpa;
	}
}

class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if(StudentComparator.compareCGPA(o1, o2) != 0) {
			return StudentComparator.compareCGPA(o1, o2);
		} else if (StudentComparator.compareFirstName(o1, o2) != 0) {
			return StudentComparator.compareFirstName(o1, o2);
		} else {
			return StudentComparator.compareID(o1, o2);
		}
	}
	private static int compareCGPA(Student o1, Student o2) {
		if (o1.getCGPA() > o2.getCGPA()) {
			return -1;
		} else if (o1.getCGPA() < o2.getCGPA()) {
			return 1;
		} else {
			return 0;
		}
	}
	private static int compareFirstName(Student o1, Student o2) {
		if (o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		} else if (o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
	private static int compareID(Student o1, Student o2) {
		if (o1.getID() > o2.getID()) {
			return -1;
		} else if (o1.getID() < o2.getID()) {
			return 1;
		} else {
			return 0;
		}
	}
}

class Priorities {
	
	public List<Student> getStudents(List<String> events) {
		List<Student> lisOfStudents = new ArrayList<>();
		PriorityQueue<Student> queueOfStudents = new PriorityQueue<>(new StudentComparator());
		for (Iterator<String> iterator = events.iterator(); iterator.hasNext();) {
			String stringEvent = (String) iterator.next();
			String[] eventAndStudentData = stringEvent.trim().split("\\s+");
			System.out.println(eventAndStudentData[0]);
			if (eventAndStudentData[0].equals("ENTER")) {
				String name = eventAndStudentData[1];
				double cgpa = Double.parseDouble(eventAndStudentData[2]);
				int id = Integer.parseInt(eventAndStudentData[3]);
				queueOfStudents.add(new Student(id, name, cgpa));
			}
			if (eventAndStudentData[0].equals("SERVED") && !queueOfStudents.isEmpty()) {
				queueOfStudents.poll();
			}
		}
		while (!queueOfStudents.isEmpty()) {
			lisOfStudents.add(queueOfStudents.poll());
		}
		return lisOfStudents;
	}
}
