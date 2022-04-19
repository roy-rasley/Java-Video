import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
      //formatting numbers

       String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
