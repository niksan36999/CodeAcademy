package oop;

public class Book
{
  private String title;
  private String author;
  private long   ISBN;
  private int    pages;
  private String publisher;
  private double price;

  public String getAuthor()
  {
    return author;
  }

  public String getTitle()
  {
    return title;
  }

  public long getISBN()
  {
    return ISBN;
  }

  public int getPages()
  {
    return pages;
  }

  public String getPublisher()
  {
    return publisher;
  }

  public double getPrice()
  {
    return price;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public void setAuthor(String author)
  {
    this.author = author;
  }

  public void setISBN(long ISBN)
  {
    this.ISBN = ISBN;
  }

  public void setPages(int pages)
  {
    this.pages = pages;
  }

  public void setPublisher(String publisher)
  {
    this.publisher = publisher;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public void printAttributes()
  {
    System.out.println(title);
    System.out.println(author);
    System.out.println(ISBN);
    System.out.println(pages);
    System.out.println(publisher);
    System.out.println(price);
  }

  public static void printFields(Book book)
  {
    System.out.println(book.getAuthor());
    System.out.println(book.getTitle());
    System.out.println(book.getISBN());
    System.out.println(book.getPages());
    System.out.println(book.getPublisher());
    System.out.println(book.getPrice());
  }
}
