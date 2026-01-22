package Day13;
import java.lang.Thread;

public class MultiThreading extends Thread{
    public static void main(String[] args){
        MultiThreading m1 = new MultiThreading();
        m1.start();
    }

    @Override
    public void run(){
        System.out.println("Thread is runing");
    }
}
