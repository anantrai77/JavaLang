interface  camera{
    void clickphoto();
    void click4Kvideo();
}
interface wifi{
    void network();
}
class phone{
    public void calling(){
        System.out.println("Calling");
    }
    public void playing(){
        System.out.println("Playing");
    }
}
class plusPhone extends phone implements camera,wifi{
    public void clickphoto(){
        System.out.println("cheeee");
    }
    public void click4Kvideo(){
        System.out.println("Recording");
    }
    public void network(){
        System.out.println("connecting");
    }
}

public class _050Polymorphism {
    public static void main(String[] args) {
       camera cam = new plusPhone();
       //cam.network();--> not allowed
       cam.clickphoto(); //can only use camera methods

       plusPhone pp = new plusPhone();
       pp.network();//can use plusPhone methods
       pp.click4Kvideo();
       pp.clickphoto();
       pp.calling();
       pp.playing();
    }
}
