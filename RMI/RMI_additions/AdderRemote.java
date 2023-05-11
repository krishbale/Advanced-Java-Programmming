import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder{
    AdderRemote() throws RemoteException{
        super();
    }
    public int add(int a) {
    if(a == 0)
    return 1;
    return a*add(a-1);
    }
    
}
