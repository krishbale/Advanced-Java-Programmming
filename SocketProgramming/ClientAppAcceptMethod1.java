import java.io.IOException;  
import java.io.PrintStream;  
import java.net.Socket;  
import java.net.UnknownHostException;  
import java.util.Scanner;  
  
public class ClientAppAcceptMethod1 {  
  
    public static void main(String arg[]) throws UnknownHostException,IOException  
    {  
    int n,tmp;  

    Scanner sc = new Scanner(System.in);  
    Socket s = new Socket("127.0.0.1",8080);  
    Scanner sc1=new Scanner(s.getInputStream());  
    System.out.println("Enter any number");  
    n=sc.nextInt();  
    PrintStream p=new PrintStream(s.getOutputStream());  
    p.println(n);  
    tmp=sc1.nextInt();  
    System.out.println("Square of given number is: "+tmp);  
    sc.close();
    s.close();
    }  
}  