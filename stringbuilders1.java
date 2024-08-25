import java.util.*;
public class stringbuilders1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("kanon");
    System.out.println(sb);
    System.out.println(sb.charAt(0));
    sb.setCharAt(0,'a');
    System.out.println(sb);
    sb.insert(0, 'k');
    System.out.println(sb);
    sb.delete(1, 2);
    System.out.println(sb);


    }
}
