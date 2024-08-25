import java.util.*;
public class updatesbit {
    public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);
    int operation= sc.nextInt();
    int pos=1 ;
    int bitmark=1<<pos;
    int n=5;
    if (operation==1)
    {
        int num=(bitmark|n);
        
            System.out.println(num);}
        else 
        {
          notbitmark=~bitmark;
            int num=(notbitmark &n )
          
         System.out.println(num);
          
        }
    
}
    };
          
