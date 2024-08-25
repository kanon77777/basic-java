import java.util.*;
public class stringcompare {
    public static void main(String[] args) {
        
    Scanner sc =new Scanner(System.in);
    String name1= sc.nextLine();
    String name2= sc.nextLine();
    if (name1.compareTo(name2)==0)
    {
        System.out.println("equal");
    }
    else {
        System.out.println("not equal");
    }
    String name3= name1.substring(3,8);
    System.out.println(name3);
    }
}
