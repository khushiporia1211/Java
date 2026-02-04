public class constructor {
    public static void main(String[] args) {
        Stud1 s1 = new Stud1("khushi",122);
        s1.show();

    }
}
class Stud1{
    private String Name;
    private int roll;
    Stud1(String name, int rollNo){
        Name = name;
        roll = rollNo;
    }
    void show(){
        System.out.println("name ="+Name+"\n"+"rollno = "+roll);
    }
}
