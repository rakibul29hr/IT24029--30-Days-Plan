import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Day13Example1 {
    public static void main(String[] args){
        //Creating ZoneId for New York
        ZoneId DhakaZone = ZoneId.of("Asia/Dhaka");

        ZonedDateTime dhakaTime = ZonedDateTime.now(DhakaZone);
        System.out.println("Time Zone ID: "+ DhakaZone);
        System.out.println("Current time in Dhaka is : "+dhakaTime);
    }

}
