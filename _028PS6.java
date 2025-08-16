

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
        /*int [] marks = {60,88,78,67,56,45,34,43,55,78};
        int sum =0;
        for(int i=0; i<marks.length; i++){
            sum = sum + marks[i];
        }
        float avg = (sum)/(10.f);
        System.out.println(avg);*/

        //Q4
       /*int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{2,6,13},
                         {3,7,1}};
        int [][] result = {{0,0,0},
                            {0,0,0}};
        for(int i=0; i<mat1.length; i++){ //row number of times
            for(int j=0; j<mat1[i].length; j++){ //coiumn number of time
            System.out.format("Setting value for i=%d and j=%d\n",i,j);    
                result[i][j]= mat1[i][j] + mat2[i][j];
            }
        }
        for(int i=0; i<mat1.length; i++){ //row number of times
            for(int j=0; j<mat1[i].length; j++){//colun number of times
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }*/

        //Q5
        //Reversing Array
        /*int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(arr.length, 2);
        int temp;
        for(int i=0; i<n; i++){
            //Swap a[i] and a[l-1-i]
            //a   b    temp
            //|4| |3|   | |
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.print(element+" ");
        }*/

        //Q6
        /*int [] arr = {1,22,34,56,64,67,98,69};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println(max);*/

        //Q7
        /*int [] ar = {10,35,-45,38,-3,78,998,56,};
        int min = Integer.MAX_VALUE;
        for(int e : ar){
            if(e<min){
                min = e;
            }
        }
        System.out.println(min);*/

        //Q8
        //int [] arr = {12,34,54,2,63,13,};
        int [] arr = {10,12,23,34,45,54,63,74};
        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }

    }
}
