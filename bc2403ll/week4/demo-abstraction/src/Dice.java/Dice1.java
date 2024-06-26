
import java.awt.Color;
import java.util.Arrays;

public class Dice1 {
  private final Color[] color = {Color.RED, Color.YELLOW,Color.BLACK,Color.WHITE,Color.PINK,Color.BLUE,Color.WHITE};

  public Color[] getColors(){
return this.colors;
  }

  @Override
  public String toString(){
    return "Dice1("//
    +"colors="+Arrays.toString(this.colors)
    +")";
  }

  
  public static void main(String[] args) {
    Dice1 d =new Dice1();
    d.getColors()[1]=Color.RED;
    System.out.println(d.toString());
  }

}
