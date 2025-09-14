class base1{
    base1(){
        System.out.println("I am a constructor");
    }
    base1(int a){
        System.out.println("I am an overloaded constructor with value of a as : "+a);
    }
}

class derived1 extends base1{
    derived1(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    derived1(int a, int b){
        super(a);
        System.out.println("I am an overloaded derived class constructor with value of b as : "+b);
    }
}

class Childofderived1 extends derived1{
    Childofderived1(){
        System.out.println("I am a child of derived constructor");
    }
    Childofderived1(int a, int b, int c){
        super(a, b);
        System.out.println("I am an overloaded constructor of Derived with value of c as : "+c);
    }
    
}

public class _041ConstructorsInheritance {
    public static void main(String[] args) {
        //base1 b = new base1();
        //derived1 d = new derived1(14, 9);
        Childofderived1 cd = new Childofderived1(5,10,15);
    }
}
