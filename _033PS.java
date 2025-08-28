public class _033PS {
    static void multiplication(int n){
        for(int i=1; i<=10; i++){
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + sumRec(n-1); //sum(n) = sum(n-1)+n
        }
    }
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1)+ fib(n-2);
        }

    }
    static void pattern1_rec(int n){
      if(n>0){
        pattern1_rec(n-1);
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
      }
    }
    public static void main(String[] args) {
       //Q1
       multiplication(7); 

       //Q2
       pattern1(5);
       System.out.println();
       pattern1(9);

       //Q3
       int c = sumRec(9);
       System.out.println(c);

       //Q4
       //fibonacci series - 0,1,1,2,3,5,8,13,21,34...
       int result = fib(8);
       System.out.println(result);

       //Q8
       pattern1_rec(5);
    }
}
