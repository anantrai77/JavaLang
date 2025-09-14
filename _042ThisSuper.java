class Ekclass{
    public int a;
    public int geta(){
        return a;
    }
    Ekclass(int a){
        //a = a; ---> 0 output
        this.a = a; // ---> 10 output this is a reference to current object
    }
    public int retrun1(){
        return 1;
    }
}

class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("I am a constructor with c as : "+c);
    }
}


public class _042ThisSuper {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(10);
        Doclass d = new Doclass(15);
        System.out.println(e.geta());
    }
}
