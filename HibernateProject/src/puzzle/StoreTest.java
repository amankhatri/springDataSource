package puzzle;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreTest {  
public static void main(String[] args) {  
Session session=new Configuration().configure().buildSessionFactory().openSession();  
Transaction tx=session.beginTransaction();  
  
HashMap<String,User> map1=new HashMap<String,User>();  

map1.put("java is a programming language",new User("Anzee","awantik@gmail.com","india"));  
  
map1.put("java is a platform",new User("Awantik","ashok@gmail.com","india"));  
  
HashMap<String,User> map2=new HashMap<String,User>();  
map2.put("servlet technology is a server side programming", new User("John Milton","john@gmail.com","india"));  
map2.put("Servlet is an Interface", new User("Awi","ashok@gmail.com","india"));  
  
Puzzle question1=new Puzzle("What is java?",map1);  
Puzzle question2=new Puzzle("What is servlet?",map2);  
  
session.persist(question1);  
session.persist(question2);  
  
tx.commit();  
session.close();  
System.out.println("successfully stored");  
}  
}  