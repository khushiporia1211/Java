 class TV{
    private int volumeUp;
    private int volumeDown;
//    public void Of(){
//        System.out.println("TV is off");
     public  void volumeUp(){
         System.out.println("volume is up");

     }
     public void volumeDown(){
         System.out.println("volume is down");
     }
//    }
}


public class class1 {
    public static void main(String[] args) {
        TV T1 = new TV();
        T1.volumeUp();
        T1.volumeDown();
        TV t2 = new TV();
        t2.volumeDown();

    }

}
