import java.io.File;

public class Day10Example2 {
    public static void main(String[] args){
        String DirectoryPath="Project/Java";
        //creating a file object
        File directory = new File(DirectoryPath);
        if(!directory.exists())
        {
            boolean created= directory.mkdir();
            if(created){
                System.out.println("Directory created successfully "+DirectoryPath);
            }else{
                System.out.println("Failed to create directory");
            }
        }else{
            System.out.println("Directory already exists: " + DirectoryPath);
        }
    }
}
