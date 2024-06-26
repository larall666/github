
public class Square {

  public static void main(String[] args) {
    Square Square = new Square();
    Square.setlenght(13);
    System.out.println(Square.toString());
    System.out.println(Square.area());
  }
  private int length;
  

  public void setlenght (int length){
    this.length = length;
  }

  // public int getlength(){
  //   return this.length;
  // }

  public String toString(){
    return "Square length=" + this.length;
    
  }
  
  public int area(){
    return this.length * this.length;
    }

}
