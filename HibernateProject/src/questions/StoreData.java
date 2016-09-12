package questions;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		
		Answer ans1=new Answer();
		ans1.setAnswername("Life is Happiness");
		ans1.setPostedBy("Awi");
		
		Answer ans2=new Answer();
		ans2.setAnswername("Happiness is life");
		ans2.setPostedBy("Awantik");
		
		Answer ans3=new Answer();
		ans3.setAnswername("Finding life in happiness");
		ans3.setPostedBy("Zeon");
		
		Answer ans4=new Answer();
		ans4.setAnswername("Don't know what all these can possibly mean");
		ans4.setPostedBy("Zakarta");
		
		List<Answer> list1=new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
		
		List<Answer> list2=new ArrayList<Answer>();
		list2.add(ans3);
		list2.add(ans4);
		
		Question question1=new Question();
		question1.setQname("What is Happiness?");
		question1.setAnswers(list1);
		
		Question question2=new Question();
		question2.setQname("What is Life?");
		question2.setAnswers(list2);
		
		session.persist(question1);
		session.persist(question2);
		
		t.commit();
		session.close();
		System.out.println("success");
		


	}

}
