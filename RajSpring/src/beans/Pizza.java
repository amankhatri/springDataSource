package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Pizza implements Food{

	@Autowired
	@Qualifier(value="recepie")
	Recepie r;
	
	public Pizza() {

	}
	

//	@Autowired
//	@Qualifier(value="recepie")
//	public void setR(Recepie r) {
//		this.r = r;
//	}

	@Override
	public void doServeHot() {
		// TODO Auto-generated method stub
		System.out.println("Serve Pizza HOT");
		
	}

	@Autowired
	@Qualifier(value="morerecepie")
	public void setR(Recepie r) {
		this.r = r;
	}

}
