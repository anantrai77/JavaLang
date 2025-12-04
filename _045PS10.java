// class circle{
//     int radius;
//     circle(int r){
//         this.radius=r;
//     }

//     public double area(){
//         return Math.PI*this.radius*this.radius;
//     }
// }

// class cylinder extends circle{
//     public int height;
//     cylinder(int r, int h){
//         super(r);
//         this.height=h;
//     }

//     public double volume(){
//         return Math.PI*this.radius*this.radius*this.height;
//     }
// }


class rectangle{
    int l;
    int b;
    rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }

    public int area(){
        return this.l*this.b;
    }
}

class cuboid extends rectangle{
    int h;
    cuboid(int l, int b, int h){
        super(l, b);
        this.h=h;
    }

    public int surfaceArea(){
        return this.l*this.b*this.h;
    }
}

public class _045PS10 {
    public static void main(String[] args) {
        //Q1 Q3
        // circle c = new circle(6);
        // cylinder cd = new cylinder(6, 2);

        // System.out.println("The area of circle :");
        // System.out.println(c.area());
        // System.out.println("The area of cylinder :");
        // System.out.println(cd.volume());

        //Q2 Q4
        rectangle rec = new rectangle(2, 4);
        cuboid cub = new cuboid(2, 4, 6);

        System.out.println(rec.area());
        System.out.println(cub.surfaceArea());
    }
}
