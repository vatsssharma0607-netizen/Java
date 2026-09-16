interface FY
{
    
    String name = "Jane Smith";
    int rollno = 67890;
}
interface SY
{
    String name = "John Doe";
    int rollno = 12345;
}
class Student implements FY , SY
{
    void display()
    {
        System.out.println("FY Name: " + FY.name);
        System.out.println("FY Roll No: " + FY.rollno);
        System.out.println("SY Name: " + SY.name);
        System.out.println("SY Roll No: " + SY.rollno);
    }
}
class Assignment5_3
{
    public static void main(String[] args) 
    {
        Student student = new Student();
        student.display();
    }
}