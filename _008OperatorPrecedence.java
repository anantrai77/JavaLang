

public class _008OperatorPrecedence {
    public static void main(String[] args) {
        //Precedence & Associativity
   // int a = 6*5-34/2;
    /*
    =30 - 34/2   // Associativity left to right
    =30-17
    =13
     */
   // int b = 60/5-34*2;
    /*
    =12-34*2   // Associativity left to right
    =12-68
    =-56
    */
   // System.out.println(a);
    //System.out.println(b);
    
    //Quick quiz
    int x=6;
    int y=1;
    int k = x*y/2;
    System.out.println(k);

    int b=1;
    int a=2;
    int c=4;
    int d=(b*b-4*a*c)/(2*a);
    System.out.println(d); 
    } 
    

}
