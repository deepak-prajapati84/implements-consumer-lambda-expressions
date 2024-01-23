import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.LongConsumer;

public class consumer4{
    public static void main(String[] args){
        long[] Str={12,34,65,90,54};
        LongConsumer vlu=vl->System.out.println(vl +" ");
        Arrays.stream(Str).forEach(vlu);
    }
}