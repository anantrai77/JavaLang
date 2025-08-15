public class _028PS6 {
    public static void main(String[] args) {
        //Q1
        /*float [] number = { 9.1f, 8.3f, 5.7f, 6.8f, 6.6f};
        float sum = 0;
        for(int i=0; i<number.length; i++){
            sum = sum + number[i]; 
        }
        System.out.println(sum);*/

        //Q2
        /*int [] number = {9,10,45,66,77,65};
        int num = 4;
        boolean isInArray = false;
        for(int element:number){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in array");
        }
        else{
            System.out.println("The value is not present in array");
        }*/

        //Q3
        int [] marks = {60,88,78,67,56,45,34,43,55,78};
        int sum =0;
        for(int i=0; i<marks.length; i++){
            sum = sum + marks[i];
        }
        float avg = (sum)/(10.f);
        System.out.println(avg);
    }
}
