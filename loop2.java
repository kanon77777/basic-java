import java.util.*;
public class loop2 {
    public static void main(String[] args) {
        Scanner ss =new Scanner (System.in);
        int n= ss.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
