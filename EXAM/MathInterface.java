import java.rmi.* ;
import java.rmi.server.UnicastRemoteObject;


// Remote Interface 
public interface  MathInterface extends Remote {

    public int add(int a , int b ) throws RemoteException ;
    public int sub(int a , int b ) throws RemoteException;
    public int mul(int a , int b ) throws RemoteException;
    public int div(int a , int b ) throws RemoteException;

}

//Server implementing remote interface 

public class MathImpl extends UnicastRemoteObject implements MathInterface {
    public MathImpl() throws RemoteException {
        super();
    }

    public int add(int a , int b ) throws RemoteException {
        return a + b ;
    }
    public int sub(int a , int b ) throws RemoteException {
        return a - b ;
    }
    public int mul(int a , int b ) throws RemoteException {
        return a * b ;
    }
    public int div(int a , int b ) throws RemoteException {
        return a / b ;
    }

}


// rmi registry ( server ) 


public class MathServer {
    public static void main(String[] args) {
        try {

        MathImpl obj = new MathImpl() ;

        Naming.rebind("rmi://localhost/MathService" , obj) ;
        System.out.println("Server is ready .");

        } catch (Exception e) {
           System.out.println("Error Occured .");

    }
}

// Main class ( Client ) 


public class FULLRMI {
    public static void main(String[] args) {
        try {
            MathInterface obj = (MathInterface) Naming.lookup("rmi://localhost/MathService") ;
            System.out.println("Addition : " + obj.add(10, 5));
            System.out.println("Subtraction : " + obj.sub(10, 5));
            System.out.println("Multiplication : " + obj.mul(10, 5));
            System.out.println("Division : " + obj.div(10, 5));

        } catch (Exception e) {
            System.out.println("Error Occured .");
        }
    }
}
