package beans;

import java.util.List;

public class BurgerFactory {
	public Burger createBurger(int price,String ingr,List<String> comp,List<Address> addr){
		System.out.println("Factory creation");
		return new Burger(price,ingr,comp,addr);
	}

}
