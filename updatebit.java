import java.util.*;
public class updatebit {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int operation= sc.nextInt();
    int n=5;
    int pos=2 ;
    int bitmark=1<<pos;
    if (operation==1)
    {
        int num=(bitmark|n);
        
            System.out.println(num);}
        else 
        {
          notbitmark=~bitmark;
            int num=(notbitmark & n)
          
         System.out.println(num);
          
        }
    
}
    
};
    
