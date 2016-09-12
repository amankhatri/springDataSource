package beans;

public class Bata implements Shoes{

	String model;
	
	@Override
	public void makeFeelComfortable() {
		// TODO Auto-generated method stub
		System.out.println("Finally a nice shoe");
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	

}
