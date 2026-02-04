public class dataHiding {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.setData("khushi", 19,123);
        E1.getData();

    }
}
class Employee{
    private String Name;
    private int Age;
    private int Emp_id;
    void setData(String name, int age,int empId){
        Name = name;
        Age = age;
        Emp_id = empId;
    }
    void getData(){
        System.out.println("name = "+Name+"\n"+"age = "+Age+"\n"+"Employee Id = "+Emp_id);
    }
}
