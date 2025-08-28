public class _030MethodsOverloading {
    /*static void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }*/
    //Method Overloading
    static void foo(){
        System.out.println("Godd Morning bro");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+" bro ");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning "+a+" bro ");
        System.out.println("Good Morning "+b+" bro ");
    }

    /*static void tellJoke(){
        System.out.println("I invented a new word!\n plagiarism!");*/
    public static void main(String[] args) {
        //tellJoke();
        //int [] marks = {52,34,73,77,89,98};
        // case1: Changing the integer
        /*int x = 45;
        change(x);
        System.out.println("The value of marks after running change is "+x);//not changing*/
        //change2(marks);
        //System.out.println("The value of x after running change is "+marks[0]);// changing

        foo();
        foo(3000);
        foo(200, 300);
    }
}
