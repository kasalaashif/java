package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDriver {
	public static void main(String[] args) {
		
		Integer[] arr= {1, 2, 3};
		List<Integer> nums = Arrays.asList(arr);
		
		
		List<Employee> list = new ArrayList<>();
		
		Employee e1 = new Employee();
		e1.setSalary(100);
		e1.setAge(1);
		Employee e2 = new Employee();
		e2.setSalary(100);
		e2.setAge(1);
		Employee e3 = new Employee();
		e3.setSalary(100);
		e3.setAge(100);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		List<Employee> emps= (List<Employee>) list.stream()
				.filter(e -> e.getAge()>10 && e.getSalary()>10 )
				.map(e -> {e.setSalary(e.getSalary()*10); return e;}).toList();
				
		for(Employee e : emps) {
			System.out.println(e.getSalary());
		}
		
		List<Employee> emps2= (List<Employee>) list.stream()
				.filter(e -> e.getAge()==1)	
				.toList();
		
		for(Employee e : emps2) {
			System.out.println(e.getAge());
		}
	}
}
