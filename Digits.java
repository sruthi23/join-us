import java.util.*;
public class Digits{

     public static void main(String []args){
         
         DigitsOfNum df = new DigitsOfNum();
         df.digitListing();
        
     }
}
class DigitsOfNum{
    
    void digitListing()
    {
        int n,d;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        List<Integer> mylist=new ArrayList<Integer>();
        do{
            d=n%10;
            n=n/10;
            mylist.add(0,d);
        }while(n!=0);
        System.out.println(mylist); 
    }
}
