import java.rmi.Remote;
import java.rmi.RemoteException;

 public interface Adder extends Remote {
     public int Addition(int a , int b) throws RemoteException;

}