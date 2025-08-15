public class _009ResultingDataType {
    public static void main(String[] args) {
        byte x =5;
        int y =6;
        int a = y+x;
        float b= 6.54f + x;
        System.out.println(b);
        //Increment and Decrement Operators
        int i=56;
        System.out.println(i++);//print first then increment
        System.out.println(i);
        System.out.println(++i);//Increment first then print
        System.out.println(i);
        int j=67;
        int c=++j; // First j is incremented then c is assigned j(68)
        System.out.println(c);

    }
}
