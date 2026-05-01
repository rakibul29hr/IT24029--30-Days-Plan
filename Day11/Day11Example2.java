import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Day11Example2 {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        ZonedDateTime zonedNow= ZonedDateTime.now();
        System.out.println("Zoned time and date now : "+zonedNow);
    }

}
