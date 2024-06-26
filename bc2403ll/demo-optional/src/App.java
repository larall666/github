package src;

import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(upperName("Hello, World!"));
        System.out.println(upperName("Hello, World!").get());
        System.out.println(upperName(null));

        //1. ifPresent()
        Optional<String> result=upperName(null);
        result.ifPresent(e->{
            System.out.println("hello"+e.charAt(0));
        });
    upperName("Hello, World!").ifPresent(e->{
        System.out.println("hello"+e.charAt(0));

    });

    //2.isPresent()
    Optional<String>name=Optional.of("Vincent");
    if(name.isPresent()){
        System.out.println("example2="+name.get().charAt(0));
    }else{
        System.out.println("example2="+name);
    }
    
    //3.orElse
    String user=name.orElse("Jenny");//T
    System.out.println(user);//Vincent

    //4. orElseGet
    String user2=name.orElseGet(()->"Jenny");//Supplier<T>
    System.out.println(user2);//Vincent

    //5.orElseThrow
    String user3=name.orElseThrow(()->new RuntimeException());//Supplier<T>
    System.out.println(user3);//Vincent

//6.stream and optional
Cat cat=List
.of(new Cat(3,"Vincent"),new Cat(6,"Oscar"),new Cat
    }
public static Optional <String> upperName(String name){
if (name!=null)
return Optional.of(name.toUpperCase());
return Optional.empty();
}
    
}
