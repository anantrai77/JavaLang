public class _063NestedTryCatch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=56;
        marks[1]=90;
        marks[2]=69;
        try {
            System.out.println("Welcome");
            try {
                System.out.println("The value is :"+marks[5]);
            }
             catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.println("Exception in level 2");
            }
        } 
        
        catch (Exception e){
            System.out.println(e);
            System.out.println("Exception in level 1");
        }
    }
}
