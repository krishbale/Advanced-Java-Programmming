// import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
// import java.io.*;
class InetDemo{
    public static void main(String args[]) {
        InetAddress ip;
        try {
            ip = InetAddress.getByName("google.com");
             System.out.println("Hostname:"+ip.getHostName());
             System.out.println("IpAddress:"+ip.getHostAddress());
             System.out.println("localhost:"+ip.getLocalHost());


        } catch (UnknownHostException e) {
           
            e.printStackTrace();
        }
       

        
    }
    
}