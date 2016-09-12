package arraylist;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Collections;
 
public class al {
 
  public static void main(String[] args) {
    //create a HashSet object
    HashSet<String> hashSet = new HashSet<String>();
   
    //Add elements to HashSet
    hashSet.add("A");
    hashSet.add("B");
    hashSet.add("D");
    hashSet.add("E");
    hashSet.add("F");
 
    /*
       Get Enumeration over Java HashSet object using,
       static Enumeration enumeration(Collection c) method of Collections class.
     
       This method returns the enumeration object over the specified Collection.
     
    */
   
    //get the Enumeration object
    Object obj = Collections.max(hashSet);
    
    
   
    //enumerate through the HashSet elements
    System.out.println("Enumerating through Java HashSet"+obj);
//    while(e.hasMoreElements())
//      System.out.println(e.nextElement());
  }
}
 