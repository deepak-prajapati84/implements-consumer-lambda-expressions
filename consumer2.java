import java.util.function.LongConsumer;

public class consumer2{
    public static void main(String[] args){
        LongConsumer longC=(value)->{
            System.out.println("Frist Value is : " + value);
            System.out.println(value+1);
        };
        LongConsumer longC2=value2->{
            System.out.println("Second Value is :" + value2);
            System.out.println(value2-1);
        };
        LongConsumer longCAndNextLongConsumer=longC.andThen(longC2);
        longC.accept(2000);
    }
}