package base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Burger implements Food{

	Recepie r;
	
	
	
//	@Autowired
//	@Qualifier(value="Recepie")
//	public void setR(Recepie r) {
//		this.r = r;
//	}



	public void doServeHost() {
		// TODO Auto-generated method stub
		System.out.println("Server Hot " + r.components);

	}

}
