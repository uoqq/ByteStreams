package byteStrams1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lab02 {
    public static void main(String[] args) {
        String s = "hello world";
        byte[] b = s.getBytes();
        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            output.write(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab02.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab02.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream input = new FileInputStream("data.dat");
            int ch;
            while ((ch=input.read())!=-1) {
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException ex){
            Logger.getLogger(lab02.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab02.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
