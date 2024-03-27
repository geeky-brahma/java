package l7;

class CounterThread extends Thread { 
    private int lowerRange; 
    private int upperRange; 

    public CounterThread(String name, int lowerRange, int upperRange) { 
        super(name); // Set the thread name 
        this.lowerRange = lowerRange; 
        this.upperRange = upperRange; 
    } 

    @Override 
    public void run() { 
        try { 
            for (int i = lowerRange; i <= upperRange; i++) { 
                System.out.println("Thread - " + Thread.currentThread().getName() + "\nCounter - " + i); 
                Thread.sleep(5); // Sleep for 5 milliseconds 
            } 
        } catch (InterruptedException e) { 
            System.out.println("Thread " + Thread.currentThread().getName() + " interrupted."); 
        } 
    } 
}

public class Thread { 
    public static void main(String[] args) { 
        // Input values 
        String threadName = "First"; 
        int lowerRange = 10; 
        int upperRange = 15; 

        // Create and start the thread 
        CounterThread counterThread = new CounterThread(threadName, lowerRange, upperRange); 
        counterThread.start(); 
    }
}
