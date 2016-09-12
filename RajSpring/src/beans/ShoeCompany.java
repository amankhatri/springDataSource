package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class ShoeCompany {
	
	@Autowired
	Shoes shoe;
	int size;
	//@Qualifier(value="puma")
	@Autowired
	List<Shoes> shoes;

	
	//@Autowired
//	public ShoeCompany(Shoes s) {
//		this.shoe = s;
//	}
	

}
