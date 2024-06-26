package src;

public class Outer {

    private int x=10;

    private static int y=300;

    public static class StaticNested{//1.Static Nested Class
        void print(){
            System.out.println("hello "+y);
        }
    }

    class InnerH{//2.Inner class(non-static)
        void print(){
            System.out.println("hello! "+y);
            System.out.println("hello! "+x);
        }
    }
        public void print(){
            class LocalInner{
                int x;
                LocalInner(int x){
                    this.x=x;
                }
                void print(){
                    System.out.println("hello3 "+this.x);
                }
            }
            LocalInner li=new LocalInner(20);
            li.print();
        }
    
    public static void main(String[] args)  {
        Outer.StaticNested o2=new Outer.StaticNested();
o2.print();

Outer o3=new Outer();
Outer.InnerH o4 = o3.new InnerH();
o4.print();

Outer.InnerH o5=o3.new InnerH();
o5.print();

Outer o6=new Outer();
o6.print();

Drivable vincent=new Drivable() {
    @Override
    public void drive(){
        System.out.println("I'm driving...");
    }
};

vincent.drive();
    }
}
