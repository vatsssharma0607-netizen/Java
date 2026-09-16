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
class BookSales extends BookInfo
{
    int numberOfCopiesSold;
    BookSales(String author, String title, String publisher, double price, int stockPosition, int numberOfCopiesSold) 
    {
        super(author, title, publisher, price, stockPosition);
        this.numberOfCopiesSold  = numberOfCopiesSold;
    }
    public void RevenueGenerated()
    {
        double revenue = numberOfCopiesSold * price;
        System.out.println("Revenue Generated: " + revenue);
    }
    public void AllShow()
    {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock Position: " + stockPosition);
        System.out.println("Number of Copies Sold: " + numberOfCopiesSold);
    }
}
public class Assignment5_2 
{
    public static void main(String[] args) 
    {
        BookSales bookSales = new BookSales("John Doe", "Java Programming", "ABC Publisher", 50.0, 100, 50);
        bookSales.AllShow();
        bookSales.RevenueGenerated();
    }
}

