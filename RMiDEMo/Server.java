import java.io.IOException;
import java.rmi.Naming;
// import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server  {
    public static void main(String args[]) throws IOException {
        try {
            RemoteAdder s1 = new RemoteAdder();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("AdderService", s1);
        } catch (Exception e) {
            System.out.println("server"+e);        }
     
  

    }
}