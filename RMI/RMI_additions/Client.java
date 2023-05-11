import java.rmi.Naming;


public class Client {
     public static void main(String[] args) {
        try {
            String  ip = "rmi://127.0.0.1/AddService";
            Adder st = (Adder) Naming.lookup(ip);
           System.out.println(st.add(10));
        } catch (Exception e) {
            System.out.println(e);
            
        }
    }
    
}
