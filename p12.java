public class P12 {
    public static void main(String[] args) {
        // Create and start the child thread
        new MyThread();
        
        // Main thread logic
        try {
            for (int k = 5; k > 0; k--) {
                System.out.println("Running main thread: " + k);
                Thread.sleep(1000); // Delay of 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        
        System.out.println("Exiting main thread...");
    }
}

// Custom thread class
class MyThread extends Thread {
    // Constructor
    MyThread() {
        super(); // Call the base Thread class constructor
        System.out.println("Using Thread class");
        System.out.println("Child thread: " + this);
        start(); // Start the thread
    }

    // Define the thread's behavior
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Running child thread: " + i);
                Thread.sleep(1000); // Delay of 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted.");
        }
        
        System.out.println("Exiting child thread...");
    }
}
