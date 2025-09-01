class MyEmployee{
    private int id;
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
    return name;
    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
    return id;
    }
}

public class _036AccessMod {
    public static void main(String[] args){
        MyEmployee om = new MyEmployee();
        // om.id = 45;
        // om.name = "OM";
        om.setName("OM");
        System.out.println(om.getName());
        om.setId(45);
        System.out.println(om.getId());
    }   
}