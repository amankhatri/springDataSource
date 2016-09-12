package beans;

import java.util.List;

public class Burger {
	
	int price;
	String option;
	
	String ingredents;
	List<String> components;
	
	Address address;
	List<Address> laddress;
	
	public static Burger getInstance(int id,String option,List<String> comp, List<Address> addr){
		return new Burger(id,option,comp,addr);
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public Burger(int price, String option,List<String> comp,List<Address> addr) {

		this.price = price;
		this.option = option;
		this.components = comp;
		this.laddress = addr;
	}


	public void doServeHot() {
		// TODO Auto-generated method stub
		System.out.println("Serve Burger HOT");
		
	}

	public void setIngredents(String ingredents) {
		this.ingredents = ingredents;
	}

	public void onCreate(){
		System.out.println("Init...burger bean");
	}

	@Override
	public String toString() {
		return "Burger [price=" + price + ", option=" + option + ", ingredents=" + ingredents + ", components="
				+ components + ", address=" + address + ", laddress=" + laddress + "]";
	}

	
	
}