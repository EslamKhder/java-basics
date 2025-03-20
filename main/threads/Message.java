package main.threads;

public class Message {

    private boolean isProduced = false;


    public synchronized void produce(){
        System.out.println("producing data......");
        isProduced = true;
        notify();
    }

    public synchronized void consume(){
        while (!isProduced) {
            try {
                System.out.println("Waiting for data ....");
                wait();
            } catch (Exception e ) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("consuming data.....");
    }

}
