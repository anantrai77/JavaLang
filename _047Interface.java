interface bicycle{
    int i=30;
    void applyBreake(int decrement);
    void speedup(int increment);
}
interface hornBicycle{
    void hornBo();
    void hornDo();
}

class avonCycle implements bicycle, hornBicycle{
    void horn(){
        System.out.println("peee poo peee");
    }
    public void applyBreake(int decrement){
        System.out.println("Apply Breake");
    }
    public void speedup(int increment){
        System.out.println("speed up");
    }
       
    public void hornBo(){
        System.out.println("Booooooo");
    };
    public void hornDo(){
        System.out.println("Dooooo");
    };
}

public class _047Interface {
    public static void main(String[] args){
        avonCycle myCycle = new avonCycle();
        myCycle.applyBreake(2);
        myCycle.speedup(5);
        //we can create properties int interfaces
        System.out.println(myCycle.i);
        //we cannot modify the properties in interfaces as they are final
        //myCycle.i=453;
        //System.out.println(myCycle.i);
        myCycle.hornBo();
        myCycle.hornDo();
    }
}
