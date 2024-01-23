import java.util.function.LongConsumer;

public class Cosumer{
    public static void main(String[] args){
        LongConsumer consumer=(longValue)->{
            System.out.println("Long Value is : " + longValue);
        };

        consumer.accept(123L);
    }
}