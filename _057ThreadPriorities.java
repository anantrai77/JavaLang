class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        while (true) { 
           System.out.println("Thank You "+this.getName()); 
        }
        
    }
}

public class _057ThreadPriorities{ 
    public static void main(String[] args){ 
       MyThr1 t1 = new MyThr1("Anuj");
       MyThr1 t2 = new MyThr1("Ankit"); 
       MyThr1 t3 = new MyThr1("Ananta"); 
       MyThr1 t4 = new MyThr1("Anan"); 
       MyThr1 t5 = new MyThr1("Anand (most Important)");

       t5.setPriority(Thread.MAX_PRIORITY);
       t1.setPriority(Thread.MIN_PRIORITY);
       t1.start();
       t2.start();
       t3.start();
       t4.start();
       t5.start();
    }
}     
    

