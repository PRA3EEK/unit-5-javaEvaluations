package sprint1Evaluation;

public class Employee {
   private int emplId;
   private String name;
   private double salary;
public int getEmplId() {
	return emplId;
}
public void setEmplId(int emplId) {
	this.emplId = emplId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Employee(int emplId, String name, double salary) {
	super();
	this.emplId = emplId;
	this.name = name;
	this.salary = salary;
}
   @Override
public String toString() {
	return "Employee [emplId=" + emplId + ", name=" + name + ", salary=" + salary + "]";
}
public Employee() {
	// TODO Auto-generated constructor stub
}
}
