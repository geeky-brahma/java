// package l7;

class Counter {
    private int count = 0;

    // Synchronized method to ensure only one thread can access this method at a time
    public synchronized void increment() {
        count++; // Increment the counter
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }
}

class ThreadA extends Thread {
    private Counter counter;

    public ThreadA(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment(); // Call the synchronized increment method
            try {
                Thread.sleep(100); // Sleep for demonstration purposes
            } catch (InterruptedException e) {
                System.out.println("ThreadA interrupted.");
            }
        }
    }
}

class ThreadB extends Thread {
    private Counter counter;

    public ThreadB(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment(); // Call the synchronized increment method
            try {
                Thread.sleep(100); // Sleep for demonstration purposes
            } catch (InterruptedException e) {
                System.out.println("ThreadB interrupted.");
            }
        }
    }
}

public class TwoThread {
    public static void main(String[] args) {
        Counter counter = new Counter(); // Shared object between threads

        ThreadA threadA = new ThreadA(counter);
        ThreadB threadB = new ThreadB(counter);

        threadA.start(); // Start ThreadA
        threadB.start(); // Start ThreadB
    }
}