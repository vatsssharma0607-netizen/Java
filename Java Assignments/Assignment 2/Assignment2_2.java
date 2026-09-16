class mobile
{
    String companyName;
    double screenSize;
    mobile(String companyName, double screenSize) 
    {
        this.companyName = companyName;
        this.screenSize = screenSize;
    }
    void display() 
    {
        System.out.println("Company Name: " + companyName);
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}
public class Assignment2_2 
{
    public static void main(String[] args) 
    {
        mobile mobile1 = new mobile("Apple", 5.8);
        mobile mobile2 = new mobile("Samsung", 6.2);
        mobile mobile3 = new mobile("Google", 5.5);
        mobile mobile4 = new mobile("OnePlus", 6.0);
        mobile mobile5 = new mobile("Xiaomi", 5.7);
        System.out.println("Mobile 1:");
        mobile1.display();
        System.out.println("\nMobile 2:");
        mobile2.display();
        System.out.println("\nMobile 3:");
        mobile3.display();
        System.out.println("\nMobile 4:");
        mobile4.display();
        System.out.println("\nMobile 5:");
        mobile5.display();
    }
}
