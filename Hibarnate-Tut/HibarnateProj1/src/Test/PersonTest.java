package Test;

import org.hibernate.Query;
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration; 
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PersonTest {
	SessionFactory factory; 
    public void setup() {        
    	Configuration configuration = new Configuration();        
    	configuration.configure();        
    	ServiceRegistryBuilder srBuilder = new ServiceRegistryBuilder();        
    	srBuilder.applySettings(configuration.getProperties());        
    	ServiceRegistry serviceRegistry = srBuilder.buildServiceRegistry();        
    	factory = configuration.buildSessionFactory(serviceRegistry);   
    	} 
    public void shutdown() {        
    	factory.close();    
    	} 
    public void testSavePerson() {
    	setup();
    	Session session=factory.openSession();       
    	Transaction tx=session.beginTransaction();        
    	Person person=new Person();        
    	person.setName("Awantik"); 
        session.save(person); 
        tx.commit();        
        session.close();    
        } 
    
    private Person findPerson(Session session, String name) {    
    	Query query=session.createQuery("from Person p where p.name=:name");    
    	query.setParameter("name", name);    
    	Person person= (Person) query.uniqueResult();    
    return person; } 
    
    public static void main(String[] args) {
    	
		PersonTest p = new PersonTest();
		p.testSavePerson();
		Person p1 = p.findPerson(p.factory.openSession(), "Awantik");
		System.out.println(p1.name);
	}
}
