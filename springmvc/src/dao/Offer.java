package dao;

public class Offer {
	private int id;
	private String name;
	
	public Offer() {		
	}

	public Offer(String name) {
		this.name = name;
	}
	
	public Offer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name  + "]";
	}

}

