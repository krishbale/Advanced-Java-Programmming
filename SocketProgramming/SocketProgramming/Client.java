import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) throws IOException {
        try {
            

            Socket cs = new Socket("localhost",1254);



            Scanner ins = new Scanner(cs.getInputStream());
            PrintWriter pw = new PrintWriter(cs.getOutputStream());


            //
            pw.println(5);
            
            int fact = ins.nextInt();


            System.out.println("from client:"+5);
            System.out.println("from server:"+fact);


            ins.close();
            pw.close();
            cs.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}