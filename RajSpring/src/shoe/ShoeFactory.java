package shoe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShoeFactory {
	
	@Autowired
	@Qualifier(value="s1")
	Shoe shoe;

	List<Shoe> shoelist;

	@Override
	public String toString() {
		return "ShoeFactory [shoe=" + shoe + ", shoelist=" + shoelist + "]";
	}
	
//	public ShoeFactory() {
//		
//	}
//	
//	public ShoeFactory(Shoe shoe) {
//		this.shoe = shoe;
//	}
	
	

}
