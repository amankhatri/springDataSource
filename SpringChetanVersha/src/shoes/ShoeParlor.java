package shoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShoeParlor {
	
	public Shoe b;
    public Shoe p;
    
    @Autowired
    @Qualifier(value="bata")
	public void setB(Shoe b) {
    	System.out.println("In setter ");
		this.b = b;
	}
    
    @Autowired
    @Qualifier(value="puma")
	public void setP(Shoe p) {
    	System.out.println("In setter ");
		this.p = p;
	}
//	@Autowired
//	public ShoeParlor(Shoe b, String s) {
//		System.out.println("In constructor " + s);
//		this.b = b;
//	}
	
	
	

}
