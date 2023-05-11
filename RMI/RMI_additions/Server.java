import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
     public static void main(String[] args) {
        try {
            AdderRemote s1 = new AdderRemote();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("AddService", s1);
        } catch (Exception e) {
            System.out.println(e);
            
        }
    }
    
}
