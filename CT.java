// class car{
//     String brand;
//     int speed;

//     void display(){
//         System.out.println(brand+" car with speed "+speed+ " km/h");
//     }
// }

// class A{
//     int sum(int a, int b){
        
//         return a+b;
//     }
//     int sum(int a, int b, int c){
        
//         return a+b+c;
//     }
// }

class Animal{
    void display(){
        System.out.println("Animals makes sound");
    }
}
class dog extends Animal{
    @Override
    void display(){
        System.out.println("Dog barks");
    }
}

public class CT {
    public static void main(String [] arg){
    //     car car1 = new car();
    //     car1.speed = 40;
    //     car1.brand = "BMW";
    //     car1.display();
    // A a = new A();
    // System.out.println(a.sum(5,10));
    // System.out.println(a.sum(5,10,15));

    Animal a = new Animal();
    dog b = new dog();

    a.display();
    b.display();
    }
}
