class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius , int height){// constructors
        this.radius = radius;
        this.height = height;
    }

    /*public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }*/

    public double surfaceArea(){
        return 2*3.14*radius*radius + 2*3.14*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height; // for exact value of pi we use Math.PI
    }
}

class Rectangle{
    private int length;
    private int breath;

    public Rectangle(int length, int breath){
        this.length = length;
        this.breath = breath;
    }
    public int AreaOfRecatngle(){
        return length*breath;
    }
}



public class _039PS {
    public static void main(String[] args) {
        //Q1
       Cylinder myCylinder = new Cylinder(9,12);
       //myCylinder.setHeight(12);
       //System.out.println(myCylinder.getHeight());
       //myCylinder.setRadius(9);
       //System.out.println(myCylinder.getRadius());

       //Q2
       System.out.println(myCylinder.surfaceArea());
       System.out.println(myCylinder.volume());

       //Q3
       System.out.println(myCylinder.surfaceArea());// By Constructors
       System.out.println(myCylinder.volume());

       //Q4
       Rectangle rec = new Rectangle(4, 5);
       System.out.println(rec.AreaOfRecatngle());
    }
}
