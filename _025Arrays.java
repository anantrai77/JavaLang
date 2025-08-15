public class _025Arrays {
    public static void main(String[] args) {
    /*classroom of 500 students - you have to store marks of these 500 students
    You have two option:
    1. create 500 variables
    2.use Arrays(recommended)
     */
    //int [] marks; ---> Declaration
    //marks = new int[5];--->Memory allocation
    int [] marks = new int[5];//--->Declaration + allocation
    //initialization
    marks[0]=100;
    marks[1]=60;
    marks[2]=70;
    marks[3]=90;
    marks[4]=86;
    //marks[5]=96;---->throws an error
    System.out.println(marks[4]);
    
    int [] number = {33,34,23,67,89}; //--->Declaration + initialize
    System.out.println(number[2]);
    }
}
