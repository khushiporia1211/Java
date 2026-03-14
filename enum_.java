enum Dept{
    CS,IT,CIVIL,ECE;
    private Dept(){
        System.out.println(this.name());
    }
}
public class enum_ {
    public static void main(String[] args) {
        Dept d = Dept.ECE;
//        System.out.println(d.ordinal());
//        System.out.println(d.name());
//        Dept list[] = Dept.values();
//        for(Dept X : list){
//            System.out.println(X);
//        }
        switch (d){
            case CS :
                System.out.println("Head: John\nBlock : A");
            case IT:
                System.out.println("Head: Smith\nBlock : B");
            case CIVIL:
                System.out.println("Head: Srinivas\nBlock : C");
            case ECE:
                System.out.println("Head: Dave\nBlock : D");
        }
    }
}
