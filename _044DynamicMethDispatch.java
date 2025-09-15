class Phone{
    public void greet(){
        System.out.println("Good morning");
    }
    public void on(){
        System.out.println("Turning phone on...");
    }
}
class SmartPhone extends Phone{
    public void name(){
        System.out.println("Samsung");
    }
    public void on(){
        System.out.println("Turning smart phonr on...");
    }
}

public class _044DynamicMethDispatch {
    public static void main(String[] args) {
    //    Phone p = new Phone();
    //    p.greet();
    //    SmartPhone sp = new SmartPhone();
    //    sp.name();
    //    sp.greet(); //All Allowed

    Phone p = new SmartPhone();
    //SmartPhone sp = new Phone(); ---> Not Allowed
    p.greet();
    p.on(); // SmartPhone wala run hoga (object ka hoga)
    }
}
