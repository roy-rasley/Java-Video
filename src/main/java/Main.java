import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
       //implicit casting
        //byte > short > int > long > float > double
        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);
    }
}
