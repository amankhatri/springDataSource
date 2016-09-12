package shoes;

public class Bata implements Shoe{

	public int price;
	
	public Bata(){
		System.out.println("Zero : Constructing Bata");
	}
	
	public Bata(int price) {
		this.price = price;
		System.out.println("Constructing Bata");
	}
	
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void doMakeFeetComfortable() {
		// TODO Auto-generated method stub
		
		System.out.println("Making feet comfortable since 1827");
		
	}
	
	static public Bata createBataShoes(){
		System.out.println("Constructing Bata from factory");
		int rand = (int)(Math.random()*1000);
		return new Bata(rand);
	}
	
}
