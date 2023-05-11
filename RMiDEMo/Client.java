// import java.io.IOException;
// import java.lang.WeakPairMap.Pair.Lookup;
import java.rmi.Naming;
// import java.rmi

public class Client{
    public static void main(String args[])  
    {
        try {
            String ip = "rmi://localhost:1099/AdderService";
            Adder st = (Adder) Naming.lookup(ip);
            System.out.print("The sum of two number is "+st.Addition(3, 4));
        } catch (Exception e) {
            System.out.println(e);
        }
      
    }
}