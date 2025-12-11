class Thread1 extends Thread{
    public void run(){
        int i=0;
        while (i<4000) { 
           System.out.println("My Thread1 is cooking");
           System.out.println("This is good");
           i++;
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        int i=0;
        while (i<4000) { 
            System.out.println("Chatting by Thread2");
            System.out.println("This is bad");
            i++;
        }
    }
}

public class _054Thread {
    public static void main(String[] args) {
       Thread1 t1 = new Thread1();
       Thread2 t2 = new Thread2();

       t1.start();
       t2.start();
       
    }
}
