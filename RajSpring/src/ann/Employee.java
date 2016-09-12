package ann;

public class Employee {
	 
    private String name;
     
    public String getName() {
        return name;
    }
 
    //@Loggable
    public void setName(String nm) {
    	System.out.println("In setname()");
        //this.name=nm;
    }
    
    public void setChar(String nm,String m) {
    	System.out.println("In setchar()");
        //this.name=nm;
    }
    
    public void setId(int id){
    	System.out.println("Setting Id");
    }
       
}
