package MultiThreading;

public class Threading implements Runnable {
    @Override
    public void run(){
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e ){} ;
        }
    }
    public static void main(String[] args) {
        Threading thr = new Threading();
        Thread t1 = new Thread(thr);
        t1.start();
    }
}

// Here MultiThreading is acieved using implementing the Runnable interface . 