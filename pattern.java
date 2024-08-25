import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int number =1;
        Scanner ss= new Scanner (System.in);
        int n= ss.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1 ;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        } 
    }
}
