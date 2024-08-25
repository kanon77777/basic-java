import java.util.*;
public class stringreverse {
    public static void main(String[] args) {
        StringBuilder ss=new StringBuilder("tango");
        for (int i=0;i<ss.length()/2;i++)
        {
           int  fort =i;
           int back=ss.length()-1-i;
           char  fortchar =ss.charAt(fort);
           char  backchar= ss.charAt(back);
           ss.setCharAt(fort, backchar);
           ss.setCharAt(back, fortchar);
        } 
        System.out.println(ss);
    }
}
