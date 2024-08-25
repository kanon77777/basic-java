class Student{
    String  name;
    int age;
    public void Studentinfo(String name){
        System.err.println(name);
    }
    public void Studentinfo(int age){
System.out.println(age);
}
void Studentinfo(String name,int age){
    System.out.println(name+" "+age);
}
}
public class polymorphism {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name ="kanon";
        s1.age=24;
          s1.Studentinfo(s1.name ,s1.age);
    }
    
}
