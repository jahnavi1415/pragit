/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
      String s="abac";
     
     
      List<List<String>> ans= subsets(s);
      for(List<String> i:ans)
      {
      System.out.println(i);
      }
    }
   
   
    //ITERATIVE
    static List<List<String>> subsets(String s)
    {
       
        List<List<String>> out=new ArrayList<>();
        out.add(new ArrayList<>());
        char x=0;//new
        char[] ch=s.toCharArray();
         Arrays.sort(ch);
        for(char a:ch)
        {
       int n=out.size();
       if(a!=x){//new
       for(int i=0;i<n;i++)
       {
           List<String> inte=new ArrayList<>(out.get(i));
          
           inte.add(""+a);
           out.add(inte);
       }
       x=a;//new
        }}
        return out;
    }
    
    
     
 static ArrayList<String> ans=new ArrayList<>();
   
    //1st method
    static void subsets(String p,String s)
    {
        
        if (s.isEmpty())
        {
            //System.out.println(p);
             ans.add(p);
            return ;
        }
        char a=s.charAt(0);
        
        subsets(p+a,s.substring(1));
        subsets(p,s.substring(1));
        int ascii=(int)a;
        subsets(p+ascii,s.substring(1));
    
    }


}
