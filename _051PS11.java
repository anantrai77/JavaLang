// abstract class pen{
//     abstract void write();
//     abstract void refil();
// }

// class fountainPen extends pen{
//     void changeNib(){
//         System.out.println("Change nib");
//     }
//     void write(){
//         System.out.println("Write");
//     }
//     void refil(){
//         System.out.println("Refil");
//     }
// }

// class Monkey{
//     void jump(){
//         System.out.println("Jumping");
//     }
//     void bite(){
//         System.out.println("Bite");
//     }
// }
// interface BasicAnimal{
//     void eat();
//     void sleep();
// }
// class Human extends Monkey implements BasicAnimal{
//     void speak(){
//         System.out.println("Speak");
//     }
//     @Override
//     public void eat(){
//         System.out.println("Eating");
//     }
//     @Override
//     public void sleep(){
//         System.out.println("sleeping");
//     }
// }

interface TVRemote{
    void volume();
}
interface SmartTVRemote extends  TVRemote{
    void wifi(); 
}
class TV implements TVRemote{
    public void volume(){
        System.out.println("Volume");
    }
}

public class _051PS11 {
    public static void main(String[] args) {
        //Q1 Q2
        // fountainPen fp = new fountainPen();
        // fp.changeNib();
        // fp.write();

        //Q3
    //     Human h = new Human();
    //     h.bite();
    //     h.eat();
    //     h.jump();
    //     h.sleep();
    //     h.speak();

    //     //Q5
    //     Monkey m = new Human();
    //     //m.speek();
    //     //m.eat();
    //     m.bite();
    //     BasicAnimal Om = new Human();
    //     Om.eat();
    //     //om.bite();

    //Q6 Q7
    TV tv = new TV();
    tv.volume();
    //tv.wifi();
     }
}
