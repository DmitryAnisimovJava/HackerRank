package lambdaEx;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

class TestEmployee {

	void printEmployee(Employee employee) {
		System.out.println(employee.getName() + " " + employee.getDepartment() + " " + employee.getSalary());
	}

	void workerFilter(ArrayList<Employee> list, Predicate<Employee> predicate) {
		for (Employee employee : list) {
			if (predicate.test(employee)) {
				printEmployee(employee);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>(Arrays.asList(
				new Employee("Johnny", "It", new BigDecimal(1000)),
				new Employee("Richard", "Knight", new BigDecimal(10)), new Employee("Aren", "It", new BigDecimal(200)),
				new Employee("Dinosaur", "Dinosaur", new BigDecimal(500)),
				new Employee("Eva", "Bosser", new BigDecimal(20))));
		TestEmployee tester = new TestEmployee();
		tester.workerFilter(list, em -> em.getSalary() > 100);
	}
}
