import java.util.*;
class UniqueArrayList{
    public static void main(String arg[])
    {
        int i,j;
       List<Integer> mylist = new ArrayList<Integer>();
       mylist.add(1);
       mylist.add(2);
       mylist.add(3);
       mylist.add(2);
       mylist.add(5);
       mylist.add(1);
       for(i=0;i<mylist.size();i++)
       {
            for(j=i+1;j<mylist.size();j++){
              if(mylist.get(i)==mylist.get(j))
              { 
                  mylist.remove(j);
              }
            }
       }
       
       System.out.println(mylist);
    }
}
