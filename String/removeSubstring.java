/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
      String s="baccadappldapplefj";
      String skip="apple";
    
      System.out.println(noString(s));
    }
     
    static StringBuilder sb=new StringBuilder();
   
    //1st method
    static String noString(String s)
    {
        if (s.isEmpty())
        {
            return "";
        }
        
          
            if (s.startsWith("app") && !s.startsWith("apple"))
            {
              return noString(s.substring(3));
            }
            else{
                return  s.charAt(0)+ noString(s.substring(1));
            }
           
        
       
        
    }


}
