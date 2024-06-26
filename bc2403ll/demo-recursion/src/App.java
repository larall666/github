package src;

public class App {
    public static void main(String[] args) throws Exception {
        // int result =1;
        // for(int i =1;i<=5;i++){
        //     result*=i;
        // }
        // System.out.println(result);
        System.out.println(multiply(4));
        System.out.println(addEven(100));
        System.out.println(fs(10));
    }

    public static int fs(int n){
        if (n<=1)
        return n;
        return n + fs(n-2);
    }

    public static int addEven(int n){
        if (n<=2)
        return n;
        return n + addEven(n-2);
    }


    public static int multiply(int n){
        if (n <= 1)
        return n;
return n*multiply(n-1);
    }
}
