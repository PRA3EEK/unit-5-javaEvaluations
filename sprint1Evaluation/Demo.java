package sprint1Evaluation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Demo {

	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
	
	     Map<Employee, String> res = new TreeMap<>(new EmployeeComp());
	     
		for(Map.Entry<Employee, String> m : originalMap.entrySet()) {
			res.put(m.getKey(), m.getValue());
		}
		return res;
	}

	
	public static void main(String[] args) {
		
		Map<Employee, String> map = new HashMap<>();
		map.put(new Employee(1,"prateek", 10000), "delhi");
		map.put(new Employee(2,"pratham", 15000), "delhi");
		map.put(new Employee(3,"aniket", 20000), "delhi");
		map.put(new Employee(4,"monty", 25000), "delhi");
		map.put(new Employee(5,"piyush", 30000), "delhi");
		
		Demo d = new Demo();
		System.out.println(d.sortMapUsingEmployeeSalary(map));
	}
}
