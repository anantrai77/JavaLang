class thre extends Thread{
    public void run(){
        while (true){ 
         System.out.println("Good Morning");   
        }
    }
}
class thre1 extends Thread{
    public void run(){
        while (true) {
        //Q2
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
         System.out.println("Welcome");   
        }
    }
}

public class _059PS13 {
    public static void main(String[] args) {
        thre t = new thre();
        thre1 t1 = new thre1();
        //Q3
        t.setPriority(10);
        t1.setPriority(7);
        System.out.println(t.getPriority());
        System.out.println(t1.getPriority());

        //Q1
        // t.start();
        // t1.start();

        //Q4
        System.out.println(t1.getState());

        //Q5
        System.out.println(Thread.currentThread().getState());
    }
}
