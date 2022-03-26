package Tutorial.Geek;

public class Geek {
    public static void main(String[] args) {
        Employee E = new Employee();
        E.name="Ram";
        E.age= 26;
        System.out.println(Employee.phone);
        E.show();
        Employee.ClassMethod();

    }
}
class Employee {
    String name= "";
    int age = 0;
    static int phone= 255421;
    public void show(){
        System.out.println(name + " "+age  );
    }
    public static void ClassMethod(){
        System.out.println("This method access by without creating object");
    }
}
