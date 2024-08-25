
import java.util.*;
public class stingsaddlength {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String Fname =sc.next();
        String Sname= sc.next();
        System.out.println(Fname +" "+ Sname);
        String fullname = Fname + Sname;
        System.out.println(fullname.length());
        for(int i=0;i<=fullname.length();i++)
        {
            System.out.println(fullname.charAt(i));
        }
    }
}
