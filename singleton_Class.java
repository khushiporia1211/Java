class coffeeMachine{
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private coffeeMachine my = null;

    private coffeeMachine(){
        coffeeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }

    public void fillWater(float qty){
        waterQty = qty;
    }
    public void fillSugar(float qty){
        sugarQty = qty;
    }
    public float getCoffee(){
        return 0.15f;
    }

    static coffeeMachine getInstance(){
        if(my == null)
            my = new coffeeMachine();
            return my;

    }
}
public class singleton_Class {
    public static void main(String[] args) {
        coffeeMachine m1 = coffeeMachine.getInstance();
        coffeeMachine m2 = coffeeMachine.getInstance();
        coffeeMachine m3 = coffeeMachine.getInstance();
        System.out.println(m1+" "+m2+" "+m3);

        if(m1==m2 && m1==m3){
            System.out.println("same");
        }
    }
}
