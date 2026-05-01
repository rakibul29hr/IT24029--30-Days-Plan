import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Day12Example1 {
    public static void main(String[] args){
        //get the current date
        LocalDate currentDate= LocalDate.now();
        //define the format
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Formate the Date
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
    }
}
