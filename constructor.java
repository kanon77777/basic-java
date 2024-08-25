

class Employe{
    String name;
    int age;
    int salary;
    //non parameter 
    public void name(){
        System.out.println("kanon");
    }
    //parameter constructor
    Employe(int age,int salary){
      this.age=age;
       this.salary=salary;
       System.out.println(this.age);
       System.out.println(this.salary);
    }
    //copy constructor
    Employe(Employe E2){
        this.age=E2.age;
       this.salary=E2.salary;
       System.out.println(this.age);
       System.out.println(this.salary);
    }

}
public class constructor {
    public static void main(String[] args) {
        
        //Employe E1=new Employe();
        Employe E1 =new Employe(24,15000);
        //E1.age=24;
        //E1.salary=15000;
        E1.name();
        Employe E2=new Employe(E1);
    }
}
