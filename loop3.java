import java.util.*;
public class loop3 {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        int n= ss.nextInt ();
        for (int i=0;i<n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
