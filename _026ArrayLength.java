public class _026ArrayLength {
   public static void main(String[] args) {
    int [] marks = {98,78,67,99,80};
    /*float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 88.5f};
    String [] students = {"Harry","Rohan","Shubham","Om"};
    System.out.println(marks.length);
    System.out.println(students.length);*/

    //Displaying the arrey (Naive way)
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(marks[3]);
    System.out.println(marks[4]);

    //Displaying the Array (for loop)
    System.out.println("Printing using for loop");
    for(int i=0; i<marks.length; i++){
        System.out.println(marks[i]);
    }

    //Displaying the Array (for loop)
    System.out.println("Printing using for loop in reverse order");
    for(int i=marks.length -1; i>=0; i--){
        System.out.println(marks[i]);
    }

    //Displaying the Array (for-each loop)
    System.out.println("Printing using for-each loop");
    for(int element: marks){
        System.out.println(element);
    }
    
   } 
}
