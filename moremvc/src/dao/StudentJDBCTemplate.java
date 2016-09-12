package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentJDBCTemplate implements StudentDAO {
	  
	   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;

//	   public StudentJDBCTemplate(){
//		   System.out.println("Successfully doing");
//	   }
	   	   
	   @Autowired
	   public void setDataSource(DataSource dataSource) {
		  System.out.println("Constructing things");
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }

	   public void create(String name, Integer age) {
	      String SQL = "insert into Student (name, age) values (?, ?)";
	      
	      jdbcTemplateObject.update( SQL, name, age);
	      System.out.println("Created Entry Name = " + name + " Age = " + age);
	      return;
	   }


}