import java.rmi.Naming;

public class client {
    public static void main(String[] args) {
        try {
            Hello obj = (Hello) Naming.lookup("//localhost/Hello");
            String message = obj.sayHello();
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Hello Cient exception:"+e);
        }
        
    }
    
}