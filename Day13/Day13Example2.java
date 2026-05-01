import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Day13Example2 {
    public static void main(String[] args){
        //Define the meeting time in UTC
        ZonedDateTime meetingTimeUTC= ZonedDateTime.parse("2026-05-30T15:00:00Z");
        //Define participant time fzones
        String[] participantTimeZones={
                "America/New_York",
                "Europe/London",
                "Asia/Dhaka"
        };

        //Formate for displaying the date and time
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:ss z");
        //print the metting time in each participant's local time zone

        System.out.println("Meeting itme in UTC: "+ meetingTimeUTC.format(formatter));
        for(String timeZone : participantTimeZones){
            ZonedDateTime localTime= meetingTimeUTC.withZoneSameInstant(ZoneId.of(timeZone));
            System.out.println("Meeting Time in "+ timeZone + " : "+ localTime.format(formatter));
        }
    }
}
