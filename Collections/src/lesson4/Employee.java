package lesson4;

public class Employee implements Comparable <Employee>{
	
	String name;
	int salary;
@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
String dept;
public Employee(String name, int salary, String dept) {
	super();
	this.name = name;
	this.salary = salary;
	this.dept = dept;
}
@Override
public int compareTo(Employee o) {
	if(this.salary < o.salary) {
		return -1;
	}
	else if (this.salary > o.salary){
		return 1;
	}
	else
	return 0;
}

}
