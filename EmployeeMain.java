package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee(3, "John Doe", 21);
		Employee e2 = new Employee(1, "Bruce Wayne", 21);
		Employee e3 = new Employee(5, "Peter Parker", 21);
		Employee e4 = new Employee(2, "Wally West", 22);
		Employee e5 = new Employee(4, "Jane Doe", 22);
		
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		//Comparable
		Collections.sort(employees);
		
		//Comparator using lambda
		Collections.sort(employees, (a, b) -> { 
			return Integer.compare(a.getAge(), b.getAge());
		});
		
		//comparing multiple fields
		Comparator<Employee> sortByAgeThenName = Comparator
				.comparing(Employee::getAge).reversed()
				.thenComparing(Employee::getName);
		
		Collections.sort(employees, sortByAgeThenName);
		
		System.out.println(employees.toString());
		
		
	
		
	}
}
