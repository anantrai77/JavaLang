class MyMainEmployee{
    private int id;
    private String name;


public MyMainEmployee(){  // Constructors
    id = 45;
    name = "Anant";
}

public String getName(){return name;}
public int getId(){ return id;}
}
public class _038Constructors {
    public static void main(String[] args) {
        MyMainEmployee om = new MyMainEmployee();
        System.out.println(om.getId());
        System.out.println(om.getName());
    }
}