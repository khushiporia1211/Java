public class ClassStructure {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Khushi";
        s1.age = 19;
        s1.rollno = 122;
        s1.gmail = "khushiporia09@gmail.com";
        s1.display();

        s2.name = "Tannu";
        s2.age = 20;
        s2.rollno = 12;
        s2.gmail = "tannu@gmail.com";
        s2.display();


    }
}
class Student{
    String name;
    int rollno;
    int age;
    String gmail;
    void display(){
        System.out.println(
                "Name = "+name+"\n"+"Age = "+age+"\n"+"Rollno = "+rollno+"\n"+"Gmail = "+gmail
        );
    }
}
