public class _032Recursion {
    // factorial(0) = 1
    // factorial(n) = n * factorial(n-1)
    static int factorial(int n){
       if(n==0 || n==1){
        return 1;
       } 
       else{
        /*int product =1; // factorial iterative
        for(int i=1; i<=n; i++){
            product *=i;
        }
        return product;*/
        return n*factorial(n-1);
       }
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("The value of factorial n is : "+factorial(n));
    }
}
