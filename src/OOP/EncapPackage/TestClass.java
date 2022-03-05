package OOP.EncapPackage;

public class TestClass {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setStuName("James");
        obj.setStuRollNo(12345);
        obj.setStuAge(18);

        System.out.println("student name is " + obj.getStuName());
        System.out.println("student Roll is " + obj.getStuRollNo());
        System.out.println("student age is " + obj.getStuAge());
    }

}
