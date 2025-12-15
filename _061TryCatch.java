public class _061TryCatch {
    public static void main(String[] args) {
        //Without Try
    //    int a=500;
    //    int b=0;
    //    int c=a/b;
    //    System.out.println("The result is "+c);
    //    System.out.println("Program End");
    
    // with Try
    int a=500; 
    int b=0;
    try{
        int c=a/b;
        System.out.println("The result is "+c);
    }
    catch(Exception e){
        System.out.println("We failed to divide. Reason: ");
        System.out.println(e);
    }
    System.out.println("Program End");
    }
}
