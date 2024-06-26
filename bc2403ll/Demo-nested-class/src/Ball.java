package src;

public class Ball {
  private Color color;
  private double weight;

  enum Color{
    RED, YELLOW, BLACK;
  }

  public Ball(Color color,double weight){
    this.color=color;
    this.weight=weight;
  }

  //Builder Pattern (Coding Pattern)
  public static class BallBuilder{
    private Color color;
    private double weight;
  
    public BallBuilder setColor(Color color){
      this.color=color;
      return this;
    }
    public BallBuilder setWeight(double weight){
      this.weight=weight;
      return this;
    }

    public Ball build(){
      return new Ball(this.color, this.weight);
    }

  }

  public String toString(){
    return "Ball(color="+this.color//
    +", wight="+this.weight//
    +")";

  }
    public static void main(String[] args) {
      Ball ball=new Ball.BallBuilder()
      .setColor(Color.RED)
      .setWeight(30.0d)
      .build();
    System.out.println(ball);

  //   Ball ball2=new Ball.Builder()
  //   .setColor(Color.RED)
  //   .setWeight(30.0d)
  //   .build();
  // System.out.println(ball2);
  }
   
}
