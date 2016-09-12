package Test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	
	 @Id    
	 @GeneratedValue(strategy = GenerationType.IDENTITY)    
	 private Long id;    
	 
	 @Column    
	 String name; 
	    public Person() {    }
		public void setName(String string) {
			// TODO Auto-generated method stub
			this.name = string;
			
		} 

	

}
