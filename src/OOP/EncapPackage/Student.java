package OOP.EncapPackage;
// encapsulation in java is a mecchanism of wrapping the data and methods together as a single unit
// in encapsulation the variables of a class will be hidden from other classes and can be
// only thoug the methods of their current class. there fore its is also known as data hiding
//How to achieve it?
// Declare the variables of a class as private
// and provide public setter and getter methods to modify and view teh variable values
public class Student {
    private String stuName;
    private int stuRollNo;
    private int age;

    public int getStuAge(){
        return age;
    }

    public int getStuRollNo(){
        return stuRollNo;
    }

    public String getStuName(){
        return stuName;
    }

    public void setStuName(String newName){
        stuName=newName;
    }

    public void setStuRollNo(int newRollNo){
        stuRollNo = newRollNo;
    }

    public void setStuAge(int newAge){
        age = newAge;
    }


}
