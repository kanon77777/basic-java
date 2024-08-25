class Student{
    String name;
    int age;
    public void print()
{
    System.out.println("kanon");
}
public void display(){
    System.out.println(this.name);
    System.out.println(this.age);
}
}
public class oop {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name ="kanon";
        s1.age =24;
        s1.print();
        s1.display();



    }
}
