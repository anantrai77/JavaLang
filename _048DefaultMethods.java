interface camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void send(){
        greet();
        System.out.println("Sending...");
    }
}

interface wifi{
    String[] networks();
    void connectToNetwork(String network);
}

class cellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("pickup calls");
    }
}

class smartPhone extends cellPhone implements camera,wifi{
    public void takeSnap(){
        System.out.println("Smileeeee...");
    }
    public void recordVideo(){
        System.out.println("Filming....");
    }
    // default void send(){
    //     System.out.println("Sending...");
    // }
    public String[] networks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Om","Anant","Ram"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting...");
    }
}

public class _048DefaultMethods{
    public static void main(String[] args) {
        smartPhone sp = new smartPhone();
        sp.takeSnap();
        sp.send();
        //sp.greet(); Throws an erroe
        String[] ar = sp.networks();
        for(String item: ar){
            System.out.println(item);
        }
    }
}
