import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author lingyuwang
 * @date 2023-11-11 3:58 上午
 * @since 1.3.3
 **/
public class Test {

    public static void main(String[] args) {
        long nanoTime = System.nanoTime();
        System.out.println(nanoTime);

        int limitPeriod = 10;
        nanoTime = nanoTime - (long) ((long) limitPeriod * 1_000_000_000);
        System.out.println(nanoTime);
    }

}
