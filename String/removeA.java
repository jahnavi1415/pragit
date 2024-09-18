/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
      String s="baccadad";
      noa(s,s.length());
      noArec(s,0,s.length());
      System.out.println(noArec2(s,0,s.length()));
    }
     
    static StringBuilder sb=new StringBuilder();
    static StringBuilder sb2=new StringBuilder();
    //2nd method
    static StringBuilder noArec2(String s,int st,int l)
    {
     
        if(st==l)
        {
            return sb2;
        }
         if(st<l)
        {
            if(s.charAt(st)!='a')
            {
                sb2.append(s.charAt(st));
            }
           
               noArec2(s,st+1,l);
           
        }
        return sb2;
    }
    //1st method
    static void noArec(String s,int st,int l)
    {
        if (st==l)
        {
            System.out.println(sb);
            return;
        }
        if(st<l)
        {
            if(s.charAt(st)!='a')
            {
                sb.append(s.charAt(st));
            }
            noArec(s,st+1,l);
        }
       
        
    }
    //iterative
    static void noa(String s,int l)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)!='a')
            {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}