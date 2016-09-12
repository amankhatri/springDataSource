package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User implements Comparable{
	String name;
	int age;
	int salary;
	
	@Override
	public boolean equals(Object obj) {
		
		User u = (User)obj;
		
		if( this.name.equals( u.name )){
			return true;
		}
		return false;
	}

	public User(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		User u = (User)obj;
		return this.salary - u.salary;
	}
	
	
	
}

class ageSort implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		User u = (User)arg0;
		User v = (User)arg1;
		return u.age - v.age;
	}
	
}

class salarySort implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		User u = (User)arg0;
		User v = (User)arg1;
		return u.salary - v.salary;
	}
	
}

class nameSort implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		User u = (User)arg0;
		User v = (User)arg1;
		return u.name.compareTo(v.name);
	}
	
}

public class ArrayListCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<User> al = new ArrayList<>();

		User u = new User("Awi",24,219819028);
		al.add(u);
		al.add(new User("Raj",273,343232323));
		al.add(new User("Maj",123,36232323));
		al.add(new User("Kaj",253,37232323));
		al.add(new User("Zaj",323,13232323));
		
//		System.out.println(al);
//		System.out.println(al.contains(new User("Zaj",23323,232323)));
//		
//		Collections.sort(al);
//		System.out.println(al);
		
		
		Collections.sort(al, new ageSort());
		System.out.println(al);
		
		Collections.sort(al, new salarySort());
		System.out.println(al);
		
		Collections.sort(al, new nameSort());
		System.out.println(al);

	}

}
