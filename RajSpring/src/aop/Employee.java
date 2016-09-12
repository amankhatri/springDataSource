package aop;

public class Employee {
	
	public String name;

	
	public Employee() {
	}

	public String getName() {
		System.out.println("In getName()");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
