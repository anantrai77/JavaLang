class A{
    public int a;
    public int Meth1(){
        return 5;
    }
    public void Meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override // override notation
    public void Meth2(){//Method Overriding
        System.out.println("I am method 2 of class B");
    }
    public void Meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class _043MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.Meth2();

        B b = new B();
        b.Meth2();
        b.Meth3();
    }
}
