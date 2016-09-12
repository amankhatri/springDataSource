package shoes;

import java.util.ArrayList;
import java.util.List;

public class BataFactory {
	
	static int count = 0;
	List<Bata> bshoes;
	
	public BataFactory(){
		System.out.println("Creating Bata Shoes Factory");
		bshoes = new ArrayList<>();
		
		bshoes.add(new Bata());
		bshoes.add(new Bata());
		bshoes.add(new Bata());
		bshoes.add(new Bata());
	}
	
	public Bata createShoes(){
		count++;
		System.out.println("Constructing Bata from factory");
		int rand = (int)(Math.random()*1000);
		return bshoes.get(count);
	}

}
