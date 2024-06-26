package src;
import java.util.Objects;

public class Book {

    private double price;
    private String author;
    

     public Book(double price, String author) {
        this.author = author;
        this.price = price;
      }

      public double getPrice(){
        return this.price;
      }

      public String getAuthor(){
        return this.author;
      }

     @Override
     public boolean equals(Object obj){
       if (this==obj)
       return true;
       if (!(obj instanceof Book))
       return false;
       Book book=(Book) obj;
       return Objects.equals(this.price, book.getPrice())
       &&  Objects.equals(this.author, book.getAuthor());
     }
   
     @Override
     public int hashCode(){
       return Objects.hash(this.author, this.price);
     }

     @Override
     public String toString() {
       return "Book(" //
           + "price=" + this.price //
           + ", author=" + this.author //
           + ")";
     }
   
    
    public static void main (String[] args) {
       // Book Array
    Book[] books = new Book[2];
    books[0] = new Book(10.2d, "Vincent");
    books[1] = new Book(8.4d, "Jenny");
    }
}
