package main.streams;

@FunctionalInterface
public interface Math {

    int process(int x, int y);

    static void print(){
        System.out.println("hi");
    }

    default void prin1(){
        System.out.println("hi1");
    }
//    void min(int x, int y);
//    void mul(int x, int y);
}
