import java.util.*;
class UniqueArray{
    public static void main(String arg[])
    {
        int array[] = {1,2,3,3,6,1,4};
        int size,i,j,k;
        size = array.length;
        //System.out.println(size);
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++){
              if(array[i]==array[j])
              { 
                  k=j;
                  while(k!=size-1)
                  {
                      array[k]=array[k+1];
                      k++;
                    
                  }
                                

                  size=size-1;
              }
            }
        }
        
         for(i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }
       
    }
}
