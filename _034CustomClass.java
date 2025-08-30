

class Employe{
    int id;
    String name;
    int salary;
    public void printDeatails(){
        System.out.println("My id is "+id);
        System.out.println("and my names is "+name);
        System.out.println("My salary is "+salary);
    }
}
public class _034CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employe anant = new Employe();// Instianting a new Employee object
        Employe om = new Employe();
        // Setting Attributes
    anant.id = 14;
    anant.name = "Anant";
    anant.salary = 30000;
    om.id = 12;
    om.name = "OM";
    om.salary = 20000;
    om.printDeatails();
    anant.printDeatails();
    // System.out.println(anant.id);
    // System.out.println(anant.name);    
    }
}
