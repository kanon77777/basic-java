abstract class animal{
    abstract void walk();
    public void eat(){
        System.out.println("animal eats");
    }
} 
    class horse extends animal{
        public void walk(){
        System.out.println("horse has 4 legs");
    }
}
    class chicken extends animal{
        public void walk(){
        System.out.println("chickenn has 2 legs");
    }
}


public class abstracts {
    public static void main(String[] args) {
        horse hr=new horse();
        hr.walk();
        hr.eat();
    }
}
