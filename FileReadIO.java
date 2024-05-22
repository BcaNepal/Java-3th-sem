import java.io.*;
import java.util.StringBuilder;

public class FileReadIO{

    public static void main(String args[]){
        try{
            FileReadIO obj = new FileReadIO();
            obj.readFile();
        }
        catch(IOException ex){
            System.err.println(ex.getMessage());
        }
    }
    s
    public void readFile throws IOException(){
        StringBuilder sb= new StringBuilder();
        //FileInputStream fis = new FileInputStream("d:\\BCA_Java\\jmc.txt");
        FileReader fr = new FileReader("D:\\BCA_Java\\jmc.txt");
        BufferedReader bfr = new BufferedReader(fr);
        String s="";
        while((s= bfr.readLine()) != null)
        {
            sb.append(s);
        }
        System.out.println(sb.toString());
        fr.close();
        bfr.close();      
    }

}