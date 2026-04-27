import java.io.*;

public class Day9Example2 {
    public static void main(String[] args){
        try{
            FileWriter writer=new FileWriter("output.txt");
            BufferedWriter bufferedWriter= new BufferedWriter(writer);
            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();;
            bufferedWriter.write("This is a Java file handling example");
            bufferedWriter.close();
            System.out.println("Data written to file successfully.");
        }catch(IOException e){
            System.out.println("An error occured: "+e.getMessage());
        }

        try {
            FileReader reader = new FileReader("output.txt");
            BufferedReader bufferedReader= new BufferedReader(reader);
            String line;
            while((line =bufferedReader.readLine())!=null)
            {
                System.out.println(line);
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("An error occured: "+e.getMessage());
        }
    }
}
