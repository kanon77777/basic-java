import java.util.*;
public class array {
    public static void main( String []arg){
      Scanner ss= new Scanner (System.in);
      int n=ss.nextInt ();
      int number  [] =new int [n];
      for (int i=0;i<n;i++)
      {
        number [i]=ss.nextInt ();
      }
      for(int i=0;i<n;i++){
        System.out.println(number[i]);
      }

    }
    
}
