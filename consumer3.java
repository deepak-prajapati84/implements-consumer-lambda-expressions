import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.LongConsumer;

public class consumer3{
    public static void main(String[] args){
        long[] number={20,90,54,39};
        LongConsumer log=value->System.out.println(value +" ");
        Arrays.stream(number).forEach(log);
    }
}