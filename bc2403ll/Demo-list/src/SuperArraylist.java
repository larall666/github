import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class SuperArraylist extends ArrayList<Book>{

  private List<Book> books;

  private SuperArraylist(){
    books= super.subList(0, super.size()-1);
  }
  // public void insertHead(){
  //   List<Book> books = super.subList(0, super.size()-1);
  // }
  public void insertHead (Book book){
    
  }
}
