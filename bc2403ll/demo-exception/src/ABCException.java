package src;

public class ABCException extends RuntimeException {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String s = "hello";
        s=null;
        if(s!=null)
 System.out.println(s.charAt(1));

 //int num= Integer.parseInt(10s);

 checkName("Vin", "Lau");

 int[] numbers = {1, 2, 3};
int value = numbers[5]; 
System.out.println(value);
 
    }

    public static String checkName(String firstName, String lastName){
        if(firstName == null || lastName == null)
        throw new IllegalArgumentException();
        if(firstName.length() + lastName.length()>10)
        throw new ABCException();
        return firstName.concat(" ").concat(lastName);
        
    }
}
