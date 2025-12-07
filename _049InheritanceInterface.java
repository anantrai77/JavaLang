interface parentInterface{
    void meth1();
    void meth2();
}
interface childInterface extends parentInterface{
    void meth3();
    void meth4();
}

class myClass implements childInterface{
        public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class _049InheritanceInterface {
    public static void main(String[] args) {
        myClass mc = new myClass();
        mc.meth1();
    }
}
