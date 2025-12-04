class base{
  public int x;
  public int getx(){
    return x;
  }
  public void setx(int x){
    System.out.println("I am in base and setting x now");
    this.x = x;
  } 
  public void printMe(){
    System.out.println("I am constructor");
  }   
}
 class derived extends base{                      
    public int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
 }
public class _040Inheritance {
    public static void main(String[] args) {
       base b = new base();
       b.setx(4);
       System.out.println(b.getx());
      
      derived d = new derived();
      d.sety(16);
      System.out.println(d.gety());

    }
}
