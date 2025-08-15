public class _023BreakAndCont {
    public static void main(String[]args){
        /*for(int i=0; i<=50; i++){
            System.out.println(i);
            System.out.println("This is java");
            if(i==2){
                System.out.println("This ends here");
                break;
            }
        } */

        for(int i=0; i<=5; i++){
             if(i==2){
                System.out.println("This ends here");
                continue;
            }
            System.out.println(i);
            System.out.println("This is java");
        }
    }  
}
