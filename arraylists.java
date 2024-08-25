import java.util.ArrayList;
import java.util.Collections;
public class arraylists {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //add element
        list.add(0);
        list.add(2);
        list.add(4);
        System.out.println(list);

        //get element
        int element= list.get(0);
        System.out.println(element);
        // add element between;
        list.add(1, 1);
        System.out.println(list);
        //set element;
        list.set(3, 3);
        System.out.println(list);
        //remove element;
        list.remove(0);
        System.out.println(list);
        //size
        int size=list.size();
        System.out.println(size);
        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.err.println();
        //sorting
        Collections.sort(list);
        System.err.println(list);
    }
}
