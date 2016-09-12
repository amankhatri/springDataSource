package collections;

import java.util.HashMap;

class User{
	String name;
	
	

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		if(User.class.isInstance(obj)){
			User u = (User)obj;
			if(u.name.equals(this.name)){
				return true;
			}
		}
		return false;
	}



	public User(String name) {
		super();
		this.name = name;
	}



	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
	
	
}
class Details{
	int age;
	int salary;
	
	public Details(int age, int salary) {
		super();
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Details [age=" + age + ", salary=" + salary + "]";
	}
	
	
}

public class Cmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<User,Details> hm = new HashMap<>();
		
		hm.put(new User("Hari"), new Details(22,1000));
		hm.put(new User("Kari"), new Details(12,6000));
		hm.put(new User("Sari"), new Details(32,4000));
		
		System.out.println(hm.get(new User("Sari")));


	}

}
