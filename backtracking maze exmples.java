/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
   
    static List<List<List<Integer>>> y= new ArrayList<>();
	public static void main(String[] args) {
		System.out.println("Hello World");
		boolean[][] maze={
		    {false,false,false},
		    {false,false,false},
		    {false,false,false}
		};
		System.out.println(countalldirc(3,3,new ArrayList<>(),maze));
			System.out.println(y);
	}
	
	static List<List<Integer>> x= new ArrayList<>();
	static int countalldirc(int r,int c,List<List<Integer>> path,boolean[][] maze)
	{
	     
	    if(r==1 && c==1)
	    {
	        
	        y.add(new ArrayList<>(path));
	        return 1;
	    }
	   
        int t=0;
       //right
       if(maze[r-1][c-1]==true)
       {
           return 0;
       }
       maze[r-1][c-1]=true;
	   if(c>1 )
	   {List<Integer> ri=Arrays.asList(r,c-1);
	    x.add(ri);
	  //   maze[r-1][c-2]=true;
	    t=t+countalldirc(r,c-1,x,maze);
	   
	    x.remove(x.size()-1);
	  //  maze[r-1][c-2]=false;
	    
	    }
	    //left
	     if(c<maze[0].length ){// && maze[r-1][c]==false)
	   List<Integer> ri=Arrays.asList(r,c+1);
	    x.add(ri);
	   // maze[r-1][c]=true;
	    t=t+countalldirc(r,c+1,x,maze);
	    x.remove(x.size()-1);
	   // maze[r-1][c]=true;
	    }
	    //down
	    if (r>1 ){//&& maze[r-2][c-1]==false){
	     List<Integer> l=Arrays.asList(r-1,c);
	    x.add(l);
	  //  maze[r-2][c-1]=true;
	    t=t+countalldirc(r-1,c,x,maze);
	     x.remove(x.size()-1);
	    // maze[r-2][c-1]=false;
	    
	    }
	    //up
	     if (r<maze.length ){//&& maze[r][c-1]==false){
	     List<Integer> l=Arrays.asList(r+1,c);
	    x.add(l);
	   //  maze[r][c-1]=true;
	    t=t+countalldirc(r+1,c,x,maze);
	     x.remove(x.size()-1);
	  //   maze[r][c-1]=false;
	    
	    }
	    maze[r-1][c-1]=false;
	    //diagonal down
// 	     if (r>1 && c>1 &&  maze[r-2][c-2]==false){
// 	     List<Integer> rc=Arrays.asList(r-1,c-1);
// 	    x.add(rc);
// 	     maze[r-2][c-2]=true;
// 	    t=t+countalldirc(r-1,c-1,x,maze);
// 	     x.remove(x.size()-1);
// 	      maze[r-2][c-2]=false;
	    
// 	    }
       
// 	   //  //diagonal up
// 	     if (r<3 && c<3 &&  maze[r][c]==false){
// 	     List<Integer> rc=Arrays.asList(r+1,c+1);
// 	    x.add(rc);
// 	  //   maze[r][c]=true;
// 	    t=t+countalldirc(r+1,c+1,x,maze);
// 	     x.remove(x.size()-1);
// 	  //   maze[r][c]=false;
	    
// 	    }
	 
	    
	    return t;
	}
	//using boolean array to remove obstacles
	static int countall(int r,int c,List<List<Integer>> path,boolean[][] maze)
	{
	     
	    if(r==1 && c==1)
	    {
	        
	        y.add(new ArrayList<>(path));
	        return 1;
	    }
	   
        int t=0;
       //right
       if(maze[r-1][c-1]){
	   if(c>1)
	   {List<Integer> ri=Arrays.asList(r,c-1);
	    x.add(ri);
	    t=t+countall(r,c-1,x,maze);
	    x.remove(x.size()-1);
	    }
	    //left
	   //  if(c<3)
	   //{List<Integer> ri=Arrays.asList(r,c+1);
	   // x.add(ri);
	   // t=t+countallpath(r,c+1,x,maze);
	   // x.remove(x.size()-1);
	   // }
	    //down
	    if (r>1){
	     List<Integer> l=Arrays.asList(r-1,c);
	    x.add(l);
	    t=t+countall(r-1,c,x,maze);
	     x.remove(x.size()-1);
	    
	    }
	    //up
	   //  if (r<3){
	   //  List<Integer> l=Arrays.asList(r+1,c);
	   // x.add(l);
	   // t=t+countallpath(r+1,c,x,maze);
	   //  x.remove(x.size()-1);
	    
	   // }
	    //diagonal down
	     if (r>1 && c>1){
	     List<Integer> rc=Arrays.asList(r-1,c-1);
	    x.add(rc);
	    t=t+countall(r-1,c-1,x,maze);
	     x.remove(x.size()-1);
	    
	    }
       }
	   //  //diagonal up
	   //  if (r<3 && c<3){
	   //  List<Integer> rc=Arrays.asList(r+1,c+1);
	   // x.add(rc);
	   // t=t+countallpath(r+1,c+1,x,maze);
	   //  x.remove(x.size()-1);
	    
	   // }
	 
	    
	    return t;
	}
			static int countallpath(int r,int c,List<List<Integer>> path)
	{
	     
	    if(r==1 && c==1)
	    {
	        
	        y.add(new ArrayList<>(path));
	        return 1;
	    }
	   
        int t=0;
       //right
	   if(c>1)
	   {List<Integer> ri=Arrays.asList(r,c-1);
	    x.add(ri);
	    t=t+countallpath(r,c-1,x);
	    x.remove(x.size()-1);
	    }
	    //left
	     if(c<3)
	   {List<Integer> ri=Arrays.asList(r,c+1);
	    x.add(ri);
	    t=t+countallpath(r,c+1,x);
	    x.remove(x.size()-1);
	    }
	    //down
	    if (r>1){
	     List<Integer> l=Arrays.asList(r-1,c);
	    x.add(l);
	    t=t+countallpath(r-1,c,x);
	     x.remove(x.size()-1);
	    
	    }
	    //up
	     if (r<3){
	     List<Integer> l=Arrays.asList(r+1,c);
	    x.add(l);
	    t=t+countallpath(r+1,c,x);
	     x.remove(x.size()-1);
	    
	    }
	    //diagonal down
	     if (r>1 && c>1){
	     List<Integer> rc=Arrays.asList(r-1,c-1);
	    x.add(rc);
	    t=t+countallpath(r-1,c-1,x);
	     x.remove(x.size()-1);
	    
	    }
	     //diagonal up
	     if (r<3 && c<3){
	     List<Integer> rc=Arrays.asList(r+1,c+1);
	    x.add(rc);
	    t=t+countallpath(r+1,c+1,x);
	     x.remove(x.size()-1);
	    
	    }
	 
	    
	    return t;
	}
	//with obstacles lets say can not go through(2,2) or else use boolean array take it in argument
	static int countobsta(int r,int c,List<List<Integer>> path)
	{
	     
	    if(r==1 && c==1)
	    {
	        
	        y.add(new ArrayList<>(path));
	        return 1;
	    }
	   
        int t=0;
        if(c==2 && r==2)
        {
            return 0;
        }
       else{ 
	   if(c>1 )
	   {List<Integer> ri=Arrays.asList(r,c-1);
	    x.add(ri);
	    t=t+countobsta(r,c-1,x);
	    x.remove(x.size()-1);
	    }
	    
	    if (r>1){
	     List<Integer> l=Arrays.asList(r-1,c);
	    x.add(l);
	    t=t+countobsta(r-1,c,x);
	     x.remove(x.size()-1);
	    
	    }
	     if (r>1 && c>1){
	     List<Integer> rc=Arrays.asList(r-1,c-1);
	    x.add(rc);
	    t=t+countobsta(r-1,c-1,x);
	     x.remove(x.size()-1);
	    
	    }
	 
        }
	    return t;
	}
	//right, down,diagonal
		static int countrddiag(int r,int c,List<List<Integer>> path)
	{
	     
	    if(r==1 && c==1)
	    {
	        
	        y.add(new ArrayList<>(path));
	        return 1;
	    }
	   
        int t=0;
	   if(c>1)
	   {List<Integer> ri=Arrays.asList(r,c-1);
	    x.add(ri);
	    t=t+countrddiag(r,c-1,x);
	    x.remove(x.size()-1);
	    }
	    
	    if (r>1){
	     List<Integer> l=Arrays.asList(r-1,c);
	    x.add(l);
	    t=t+countrddiag(r-1,c,x);
	     x.remove(x.size()-1);
	    
	    }
	     if (r>1 && c>1){
	     List<Integer> rc=Arrays.asList(r-1,c-1);
	    x.add(rc);
	    t=t+countrddiag(r-1,c-1,x);
	     x.remove(x.size()-1);
	    
	    }
	 
	    
	    return t;
	}
	static int countrd(int r,int c,List<List<Integer>> path)
	{
	     
	    if(r==1 && c==1)
	    {
	        
	        y.add(new ArrayList<>(path));
	        return 1;
	    }
	   
        int t=0;
	   if(c>1)
	   {List<Integer> ri=Arrays.asList(r,c-1);
	    x.add(ri);
	    t=t+countrd(r,c-1,x);
	    }
	    
	    if (r>1){
	     List<Integer> l=Arrays.asList(r-1,c);
	    x.add(l);
	    t=t+countrd(r-1,c,x);
	    
	    }
	 
	    
	    return t;
	}
}
