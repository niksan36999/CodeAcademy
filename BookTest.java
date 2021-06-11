package oop;

public class BookTest
{
  public static void main(String[] args)
  {
    Book firstBook = new Book();


    firstBook.setAuthor("Steven King");
    firstBook.setISBN(9870733426094L);
    firstBook.setPages(1000);
    firstBook.setPublisher("Scribner");
    firstBook.setTitle("It");
    firstBook.setPrice(19.99);
    //firstBook.printAttributes();

    Book.printFields(firstBook);
  }
}
