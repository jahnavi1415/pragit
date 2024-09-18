/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        int[] arr={3,9,1,2,6,5,1,4,7};
       
        /*		*/

        //	bubblesort(arr);//tc->o(n^2) bc->o(n) sc->o(1) stable
        //	System.out.println(Arrays.toString(arr));
        //	selectionsort(arr);//tc->o(n^2) bc->o(n^2) sc->o(1) unstable(As we are finding max and swapping)
        //	System.out.println(Arrays.toString(arr));
        //	insertionsort(arr);//tc->o(n^2),bc->o(n),sc->o(1) stable
        //	System.out.println(Arrays.toString(arr));
        // bubblesortrecur(arr,0,arr.length-1);//tc->o(n2) bc-o(n) sc->o(n) stable
        // selectsortrecur(arr,0,arr.length);//tc->o(n^2) bc->o(n^2) sc->o(n) unstable(As we are finding max and swapping)
        //   insertionrecur(arr,1,arr.length);//tc->o(n^2),bc->o(n),sc->o(n) stable

    //   mergesortinplace(arr,0,arr.length);//tc->o(nlogn) bc->o(nlogn), sc->o(n)
    //     System.out.println(Arrays.toString(mergesort(arr)));//tc->o(nlogn) bc->o(nlogn), sc->o(n) stable
    quicksort(arr,0,arr.length);//o(nlogn),unstable,
             System.out.println(Arrays.toString(arr) );
        //	quicksort();

    }
    static void quicksort(int[] arr,int l,int h)
    {
        if(l>=h)
        {
            return;
        }
       
        int s=l;
        int e=h;
        int m=(s+(e-s)/2);
        int pivot=arr[m];
        while(s<e)
        {while(pivot>arr[s])
        {
            s++;
        }
        while(pivot<arr[e])
        {
            e--;
        }
        if(s<=e){
            swap(arr,s,e);
            S++;
            e--;
        }
        }
        quicksort(arr,s,m);
        quicksort(arr,m,e);
        
        
    }
    static void mergeinplace(int[] arr,int s,int m,int e)
    {
        int[] ans=new int[e-s];
      
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e)
        {
            if(arr[i]<arr[j])
            {
                ans[k]=arr[i];
               
                i++;
            }
            else 
            {
                ans[k]=arr[j];
               
                j++;
            }
           
                k++;

            
        }
        while(i<m)
        {
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<e)
        {
            ans[k]=arr[j];
            j++;
            k++;
        }
        for(int z=0;z<ans.length;z++)
        {
            arr[s+z]=ans[z];
        }
    }
    static void mergesortinplace(int[] arr,int s,int e)
    {
        if(e-s==1)
        {
            return;
        }
        int m=(s+(e-s)/2);

        mergesortinplace(arr,s,m);
        mergesortinplace(arr,m,e);
        mergeinplace(arr,s,m,e);
    }
    static int[] merge(int[] x, int[] y)
    {

        int l1=x.length;
        int l2=y.length;
        int i=0;
        int j=0;
        int k=0;
        int[] ans= new int[l1+l2];
        while(i<l1 && j<l2)
        {
            if(x[i]<y[j])
            {
                ans[k]=x[i];
                k++;
                i++;
            }
            else if(x[i]>y[j])
            {
                ans[k]=y[j];
                k++;
                j++;
            }
            else if(x[i]==y[j])
            {
                ans[k]=y[j];
                k++;
                j++;
                ans[k]=x[i];
                i++;
                k++;

            }
        }
        while(i<l1)
        {
            ans[k]=x[i];
            i++;
            k++;
        }
        while(j<l2)
        {
            ans[k]=y[j];
            j++;
            k++;
        }
        return ans;
    }
    static int[] mergesort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int m=arr.length/2;

        int[] x=mergesort(Arrays.copyOfRange(arr,0,m));
        int[] y=mergesort(Arrays.copyOfRange(arr,m,arr.length));
        return merge(x,y);
    }

    static void insertionrecur(int[] arr,int s,int e)
    {
        if(e-s==0)
        {
            return;
        }
        for(int j=s;j>0;j--)
        {
            if(arr[j]<arr[j-1])
            {
                swap(arr,j,j-1);
            }
            else{
                break;
            }
        }
        insertionrecur(arr,s+1,e);

    }
    static void selectsortrecur(int[] arr,int s, int e)
    {

        if(e-s==0)
        {
            return;
        }
        int m=0;
        for(int i=s;i<e;i++)
        {
            if(arr[i]>arr[m])
            {
                m=i;

            }
        }
        swap(arr,m,e-1);


        selectsortrecur(arr,s,e-1);
    }
    static int k=0;
    static void bubblesortrecur(int[] arr, int s, int e)
    {
        boolean x=true;
        if(e-s==0)
        {
            return;
        }
        for(int i=s;i<e;i++)
        {
            if(arr[i]>arr[i+1])
            {
                swap(arr,i,i+1);
                x=false;
            }
        }
        if (x){return;}
        bubblesortrecur(arr,s,e-1);


    }
    static void insertionsort(int[] arr)
    {
        for (int i=1;i<arr.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void selectionsort(int[] arr)
    {
        int mx=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i;j++)
            {
                if(arr[j]>arr[mx])
                {
                    mx=j;
                }
            }
            swap(arr,arr.length-i-1,mx);
            mx=0;

        }
    }
    static void bubblesort(int[] arr)
    {
        boolean sw=true;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                    sw=false;
                }
            }
            if(sw==true)
            {
                break;
            }
        }
    }
    static void swap(int[] arr,int f, int s)
    {
        int t=arr[f];
        arr[f]=arr[s];
        arr[s]=t;
    }
}
