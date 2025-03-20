package main.threads;

public class Counter {

    private int count = 0; // 1501


    // t1 ==>  1500
    // t2 ==>
    synchronized void increment(){
        count++;
    }


    public int getCount() {
        return count;
    }
}
