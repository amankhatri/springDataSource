package JSON;

import java.io.File;
import java.io.IOException;
import java.util.Date;
 
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
 
public class JavatoJson
{
   public static void main(String[] args)
   {
      @SuppressWarnings("deprecation")
      Employee employee = new Employee(1, "Awantik", "Das", new Date(1981,8,18));
      ObjectMapper mapper = new ObjectMapper();
      try
      {
         mapper.writeValue(new File("employee.json"), employee);
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
   }
}
