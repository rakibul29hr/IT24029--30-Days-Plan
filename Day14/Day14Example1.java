import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Day14Example1 {
    public static void main(String[] args)
    {
        String dateString= "2026-05-02";
        // Create a DateTimeFormater to define the expected format

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //Parse the string into a localDate object

        LocalDate date= LocalDate.parse(dateString, formatter);
       System.out.println("Parsed Date: "+ date);
    }

}
