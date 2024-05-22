import java.io.*;

public class FileWriteIO{

    //FileOutputStream(String name)

    public void writeFile throws IOException(){
        FileOutputStream fos = new FileOutputStream("d:\\BCA_Java\\jmc.txt");
        String msg = "Congrats! You have passed the exam";
        byte[] msgBytes = msg.getBytes();
        fos.write(msgBytes); //	write(byte[] b)
        // for(byte b : msgBytes){
        //     fos.write(b);
        // }
        // for(int i =0; i< msgBytes.length; i++){
        //     fos.write(b[i]);
        // }
        //msgBytes.forEach(x-> fos.write(x));

        fos.flush();
        fos.close();
    }
    
    public static void main(String args[]){
        try{
            FileWriteIO obj = new FileWriteIO();
            obj.writeFile();
        }
        catch(IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}