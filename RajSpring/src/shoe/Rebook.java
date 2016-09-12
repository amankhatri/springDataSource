package shoe;

import java.util.List;

public class Rebook implements Shoe{

	int price;
	List<String> brands;
	
	public Rebook() {

	}

	
	public Rebook(int price) {
		this.price = price;
	}


	public Rebook(int price, List<String> brands) {
		this.price = price;
		this.brands = brands;
	}

	@Override
	public void doMakeComfortable() {
		// TODO Auto-generated method stub
		System.out.println("Making you comfortable no matter what");
		
	}


	@Override
	public String toString() {
		return "Rebook [price=" + price + ", brands=" + brands + "]";
	}

	
}
