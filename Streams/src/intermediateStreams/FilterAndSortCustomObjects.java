package intermediateStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSortCustomObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given a list of Employee objects, 
		//filter employees with salary > 50,000 and sort them by name.
		
		List<Employee> employeesList = new ArrayList<>();
		
		Employee emp1 = new Employee();
		emp1.setName("Ashif");
		emp1.setSalary(100000);

		Employee emp2 = new Employee();
		emp2.setName("Ashraf");
		emp2.setSalary(200000);
		
		Employee emp3 = new Employee();
		emp3.setName("Ashika");
		emp3.setSalary(10000);
		
		employeesList.add(emp1);
		employeesList.add(emp2);
		employeesList.add(emp3);
		
		List<Employee> emps = employeesList.stream()
						.filter(emp -> emp.getSalary() > 50000)
						.sorted(Comparator.comparing(Employee::getSalary))
						.collect(Collectors.toList());
		
		for(Employee emp: emps)
			System.out.println(emp.getName() + ": " + emp.getSalary() );
		
	}

}
