import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Day12Example2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //get user's name;
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        //GEt the user's birthday
        System.out.println("Enter your birthday (yyyy-MM-dd): ");
        String brithDayInput = input.nextLine();
        //Parse the input string into a local Date Object;

        LocalDate birthDate = LocalDate.parse(brithDayInput);

        //Define the output format

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
        //Format the birthday using the defined formatter

        String formattedBirthday = birthDate.format(formatter);
        //Display the result
        System.out.println("Hello " + name + "! Your birthday is : "+ formattedBirthday);

        input.close();

    }
}
