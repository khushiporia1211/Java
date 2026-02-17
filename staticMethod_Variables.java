class HondaCity{
    static long price = 10;
    int a =12, b;

    static double onRoadPrice(String city) {
        switch (city) {
            case "delhi":
                return price + price * 0.1;

            case "Mumbai":
                return price + price * 0.09;

        }
        return 0;
    }
}
public class staticMethod_Variables {
    public static void main(String[] args) {
        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();
        h1.price = 20;
        h1.a = 13;
        System.out.println(h2.price);
        System.out.println(h2.a);
    }
}
