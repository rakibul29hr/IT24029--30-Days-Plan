import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10Example1 {
    public static void main(String[] args){
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream("example.txt");
            int byteData  ;
            while ((byteData=fileInputStream.read())!=-1)
            {
                System.out.print((char) byteData);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        // write file

        FileOutputStream fileOutputStream=null;
        try{
            fileOutputStream = new FileOutputStream("output.txt");
            String Data= "hello World";
            byte[] byteData= Data.getBytes();
            fileOutputStream.write(byteData);
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(fileInputStream != null){
                try {
                    fileOutputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
