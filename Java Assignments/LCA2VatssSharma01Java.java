class Book 
{
    String author;
    String title;
    String publisher;
}
class BookInfo extends Book 
{
    double price;
    int stockPosition;
    void show() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stockPosition);
        System.out.println();
    }
}
public class LCA2VatssSharma01Java 
{
    public static void main(String[] args) 
    {
        BookInfo b1 = new BookInfo();
        b1.title = "Effective Java";
        b1.author = "Joshua Bloch";
        b1.publisher = "Addison-Wesley";
        b1.price = 45.00;
        b1.stockPosition = 15;
        BookInfo b2 = new BookInfo();
        b2.title = "Clean Code";
        b2.author = "Robert C. Martin";
        b2.publisher = "Prentice Hall";
        b2.price = 42.50;
        b2.stockPosition = 8;
        BookInfo b3 = new BookInfo();
        b3.title = "Java Reference";
        b3.author = "Herbert Schildt";
        b3.publisher = "McGraw-Hill";
        b3.price = 55.00;
        b3.stockPosition = 20;
        b1.show();
        b2.show();
        b3.show();
    }
}