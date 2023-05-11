import java.rmi.Naming;

///Define the remote interfaces

//Implement the remote interfaces




//create the serverjs
public class server{
    public static void main(String[] args){
        try {
            HelloImpl obj = new HelloImpl();
            Naming.rebind("localhost/Hello", obj);
            System.out.println("Hello Server ready");
            
        } catch (Exception e) {
            System.out.println("Server failed" + e);
            
        }
    }


}