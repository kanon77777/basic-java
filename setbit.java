public class setbit {
    public static void main(String[] args) {
        int n=4;
        int pos=1;
        int bitmark=1<<pos;
        int num=bitmark|n;
        System.out.println(num);
    }
}
