public class _068Practice {
    public static void main(String[] args) {
        int [] marks = {12,34,56,78,90};
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("In reverse order");
        for(int i = marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        System.out.println("by for each loop");
        for(int element: marks){
            System.out.println(element);
        }

        int [][] flat = new int[2][3];
        flat[0][0]=101;
        flat[0][1]=102;
        flat[0][2]=103;
        flat[1][0]=201;
        flat[1][1]=202;
        flat[1][2]=203;
        System.out.println("Printing 2d array");
        for(int i=0; i<flat.length; i++){
            for(int j=0; j<flat[i].length; j++){
                System.out.print(flat[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
