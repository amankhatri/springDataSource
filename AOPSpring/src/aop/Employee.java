package aop;

public class Employee {
	String name;

	
	public String getName() {
		System.out.println("Inside getName");
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setName");
		this.name = name;
	}
	
	public String getMoreName(){
		System.out.println("Inside more getName");
		return name;
	}

}
