public class javaswing {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmark=1<<pos;
        if ((bitmark &n)==0){
            System.out.println("the value is zero");
        }
        else 
        {
            System.out.println("the value is one");
        }
    }
}