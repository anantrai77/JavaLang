abstract class parent{
    public parent(){
        System.out.println("Parent ka constructor");
    }
    public void hello(){
        System.out.println("Hello...");
    }

    abstract public void greet();
    abstract public void greet2();
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good evening");
    }
    public void bye(){
        System.out.println("Byeee...");
    } 
}
abstract class child2 extends parent{
    public void hii(){
        System.out.println("Hiiii...");
    }
}

public class _046Abstract {
    public static void main(String[] args) {
     //parent p = new parent(); -->Error 
     child c = new child();
     //child2 c2 = new child2(); -->Error
     c.bye();
    }
}
