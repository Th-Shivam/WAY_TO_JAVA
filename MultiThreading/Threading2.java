package MultiThreading;

public class Threading2 extends Thread {
    @Override
    public void run(){
        for(int i = 10 ; i>=1 ; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e ){} ;
        }
    }

    public static void main(String[] args) {
        Threading2 thr1 = new Threading2();
        thr1.start();
    }
}

// Here the multithreading is achieved using extending the thread class .