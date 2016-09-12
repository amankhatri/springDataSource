package JSON;

import java.io.File;
import java.io.IOException;
 
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
 
public class JsontoJava
{
   public static void main(String[] args)
   {
      Employee employee = null;
      ObjectMapper mapper = new ObjectMapper();
      try
      {
         employee =  mapper.readValue(new File("employee.json"), Employee.class);
      } catch (JsonGenerationException e)
      {
         e.printStackTrace();
      } catch (JsonMappingException e)
      {
         e.printStackTrace();
      } catch (IOException e)
      {
         e.printStackTrace();
      }
      System.out.println(employee);
   }
}
