class Phone{
    void call(){
        System.out.println("Phone making call");
    }
    void sms(){
        System.out.println("Phone sending SMS");
    }
}
interface Camera{
    void click();
    void record();
}
interface MusicPlayer{
    public void play();
    public void pause();
    public void stop();
}
class smartPhone extends Phone implements Camera,MusicPlayer{
    void videoCall(){
        System.out.println("Smartphone making video call");
    }
    public void click(){
        System.out.println("clicking photo");
    }
    public void record(){
        System.out.println("recording video");
    }
    public void play(){
        System.out.println("music is playing");
    }
    public void pause(){
        System.out.println("pause music");
    }
    public void stop(){
        System.out.println("Stop music");
    }
}
public class Interface_SmartPhone {
    public static void main(String[] args) {
        smartPhone s = new smartPhone();
        Phone p = s; // can access only phone class method
        s.click();
        s.videoCall();
        s.play();
        s.pause();
        p.sms();

    }
}
