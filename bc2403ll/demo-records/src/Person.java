package src;

public record Person(String name,int age) {

    public static int x=10;
    public static int getX(){
        return x;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
