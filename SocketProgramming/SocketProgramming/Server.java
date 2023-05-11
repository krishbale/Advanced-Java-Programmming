import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
// import java.net.SocketImplFactory;
import java.util.Scanner;

public class Server  {
    static int fact(int a){
        if(a == 0) return  1;
        return a*fact(a-1);
    }
    public static void main(String args[]) throws IOException{
        try {
            ServerSocket ss = new ServerSocket(1254);
             
           
            Socket cs  = ss.accept();


            Scanner ins = new Scanner(cs.getInputStream());
            PrintWriter pw = new PrintWriter(cs.getOutputStream());


            //
            int num = ins.nextInt();
            
             pw.println(fact(num));
            


            ins.close();
            pw.close();
            ss.close();

        
            
            
        } catch (Exception e) {
          
        }
    }
}