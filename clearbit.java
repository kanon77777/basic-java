public class clearbit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmark=1<<pos;
        int notbitmark=~bitmark;
        int num=(notbitmark&n);
        System.out.println(num);
    }
}
