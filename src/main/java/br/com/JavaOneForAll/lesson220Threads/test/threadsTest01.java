package br.com.JavaOneForAll.lesson220Threads.test;

class ThreadExample extends Thread{
    private final char c;

    public ThreadExample(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }

        }
    }
}
public class threadsTest01 {
    public static void main(String[] args) {
//        ThreadExample example1 = new ThreadExample('A');
//        ThreadExample example2 = new ThreadExample('B');
//        ThreadExample example3 = new ThreadExample('C');
//        ThreadExample example4 = new ThreadExample('D');
//        example1.run();
//        example2.run();
//        example3.run();
//        example4.run();
//        System.out.println("------------");
//        example1.start();
//        example2.start();
//        example3.start();
//        example4.start();

        Thread t1 = new Thread(new ThreadRunnableExample('A')) ;
        Thread t2 = new Thread(new ThreadRunnableExample('B')) ;
        Thread t3 = new Thread(new ThreadRunnableExample('C')) ;
        Thread t4 = new Thread(new ThreadRunnableExample('D')) ;

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }


}

class ThreadRunnableExample implements Runnable{

    private final char c;

    public ThreadRunnableExample(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }

        }
    }
}
