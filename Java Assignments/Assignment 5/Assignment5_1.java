class Book 
{
    String author;
    String title;
    String publisher;
    Book(String author, String title, String publisher) 
    {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }
}
class BookInfo extends Book 
{
    double price;
    int stockPosition;
    BookInfo(String author, String title, String publisher, double price, int stockPosition) 
    {
        super(author, title, publisher);
        this.price = price;
        this.stockPosition = stockPosition;
    }
    void show() 
    {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock Position: " + stockPosition);
    }
}
public class Assignment5_1 
{
    public static void main(String[] args) 
    {
        BookInfo bookInfo = new BookInfo("John Doe", "Java Programming", "ABC Publisher", 50.0, 100);
        bookInfo.show();
    }
}
