import java.util.*;
public class RotateTheList{

    public static void main(String arg[])
    {
        
       // ListClass lc = new ListClass();
       List<Integer> mylist = new ArrayList<Integer>();
       mylist.add(1);
       mylist.add(2);
       mylist.add(3);
       mylist.add(4);
       mylist.add(5);
       mylist.add(6);
       
       ListClass lc = new ListClass();
       lc.rotateFunction(mylist);
      
    }

}

class ListClass{
    
    int i,k,t;
    void rotateFunction(List<Integer> mylist)
    {
        System.out.println("number of rotations");
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
         for(i=0;i<k;i++)
       {
           t=mylist.get(0);
           mylist.add(t);
           mylist.remove(0);
           
       }
       System.out.println(mylist);
    }
}

