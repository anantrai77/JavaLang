

class Ques1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
       System.out.println("Ringing..."); 
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int breath;
    public int areaa(){
        return length * breath;
    }
    public int perimeterr(){
        return 2*(length+breath);
    }

}

class Tommy{
    public void run(){
        System.out.println("Running");
    }
    public void hit(){
        System.out.println("Hitting");
    }
    public void fire(){
        System.out.println("Firing");
    }
}

class Circle{
    int radius;
    public float areaaa(){
        return 3.14f*radius*radius;
    }
    public float perimeterrr(){
        return 2*3.14f*radius; 
    }
}

public class _035Ps {
    public static void main(String[] args) {
        //Q1
        Ques1 Employee = new Ques1();
        Employee.salary = 20000;
        Employee.setName("Om");
        System.out.println(Employee.getSalary());
        System.out.println(Employee.getName());

        //Q2
        CellPhone jio = new CellPhone();
        jio.ring();
        jio.vibrate();

        //Q3
        Square sq = new Square();
        sq.side = 6;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //Q4
        Rectangle rct = new Rectangle();
        rct.length = 5;
        rct.breath = 4;
        System.out.println(rct.areaa());
        System.out.println(rct.perimeterr());

        //Q5
        Tommy game = new Tommy();
        game.run();
        game.hit();
        game.fire();

        //Q6
        Circle cir = new Circle();
        cir.radius = 4;
        System.out.println(cir.areaaa());
        System.out.println(cir.perimeterrr());
    }
}
