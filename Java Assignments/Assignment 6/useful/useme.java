package Assignment6.useful;
import java.util.Scanner;
public class useme 
{
    public void area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        if (choice == 1)
        {
            System.out.println("Enter length and breadth: ");
            double length = sc.nextDouble();
            double breadth = sc.nextDouble();
            double area = length * breadth;
            System.out.println("Area of rectangle: " + area);
        }
        else if (choice == 2)
        {
            System.out.println("Enter side: ");
            double side = sc.nextDouble();
            double area = side * side;
            System.out.println("Area of square: " + area);
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
    public void salary()
    {
        int basic, hra, da, gross;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary: ");
        basic = sc.nextInt();
        hra = (int) (0.1 * basic);
        da = (int) (0.05 * basic);
        gross = basic + hra + da;
        System.out.println("Gross salary: " + gross);   
    }
    public void percentage()
    {
        int marks1, marks2, marks3, total;
        double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects: ");
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        total = marks1 + marks2 + marks3;
        percentage = (total / 300.0) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}
