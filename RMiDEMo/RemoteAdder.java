import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteAdder extends UnicastRemoteObject implements Adder {
    RemoteAdder() throws RemoteException{
        super();

    }
    public  int Addition(int a , int b){
        return a+b;
    }
}