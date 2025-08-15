public class _010IncDecOpt {
    public static void main(String[] args) {
                //Increment and Decrement Operators
        int i=56;
        System.out.println(i++);//print first then increment
        System.out.println(i);
        System.out.println(++i);//Increment first then print
        System.out.println(i);
        int j=67;
        int c=++j; // First j is incremented then c is assigned j(68)
        System.out.println(c);
        char ch ='a';
        System.out.println(++ch);

        //Quick quiz 
        int y=7;
        int x = ++y*8;
        System.out.println(x);
    }
}
