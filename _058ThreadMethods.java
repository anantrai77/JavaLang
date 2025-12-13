class thr1 extends Thread{
    public void run(){
        int i=0;
        while(i<10000) { 
            System.out.println("Thank you");
            i++;
        }
    }
}
class thr2 extends Thread{
    public void run(){
        int i=0;
        while(i<10) { 
            System.out.println("Welcome");
            i++;
        }
    }
}

public class _058ThreadMethods {
    public static void main(String[] args) {
       thr1 t1 = new thr1();
       thr2 t2 = new thr2();
       t1.start();
       try {
           t1.join();
       } 
       catch (Exception e) {
        System.out.println(e);
       }
       
       
       t2.start();
    }
}
