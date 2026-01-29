public class returnObjectToFunction {
    public static void main(String[] args) {
        String str = new String("khushi@18#$%");
        System.out.println(update(str));

    }

    public static String update (String str) {
        int index = str.indexOf("@");
        String Name = str.substring(0,index);
        return Name;

    }
}
