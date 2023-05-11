import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MsgClient {
    public static void main(String args[]) throws IOException {
        //open your connection to a server at port 1254
        Socket cs = new Socket("localhost",1254);

        //get an input file handle from the socket and read the input
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(),true);
        
        //Perfom IO
        outs.println("Hello Server");
        
        String s = ins.nextLine();

        System.out.println("From Server:"+s);

        //Close the connection
        ins.close();
        cs.close();
        outs.close();


        
    }
    
}
