import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MsgServer{
    public static void main(String args[]) throws IOException {
        //Register service on port 1254
        ServerSocket ss = new ServerSocket(1255);

        ///wait and accept the connection
        Socket cs = ss.accept();







        //open your connection to a server at port 1254
        // Socket cs = new Socket("localhost",1254);

        //get an input file handle from the socket and read the input
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(),true);
        
        //Perfom IO
     
        String s = ins.nextLine();
        System.out.println("From Server:"+s);
        outs.println("Hello Server");
   
   

        //Close the connection
        ins.close();
        cs.close();
        outs.close();
        ss.close();

        
    }
    
}
