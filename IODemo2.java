 import java.io.*;

public class IODemo2 {
    public static void main(String[] args){
        try{
            // int a = "34" - "23";
            FileWriter fileWriter = new FileWriter("myfile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("This is a new snetene");
            
            bufferedWriter.newLine();
            bufferedWriter.close();

        }catch(Exception ex){
            System.err.println(ex);
        }
    }
    
}
