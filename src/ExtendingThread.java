public class ExtendingThread extends Thread {
/* // Sample 1
    //=====================================================
    //  Creating 2 threads and run them
    //=====================================================

    /*
    // Function that will be executed when thread is started
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {

        // Creating Threads
        ExtendingThread thread1 = new ExtendingThread();
        ExtendingThread thread2 = new ExtendingThread();

        // Executing them
        thread1.start();
        thread2.start();
    }

*/ // End Sample 1

/* // Sample 2
    //=====================================================
    //  Creating 2 threads and run them
    //=====================================================

    public Thread1 extends Thread {
        public void run() {
            System.out.println("This is Thread 1");
        }
    }

    public Thread2 extends Thread {
        public void run() {
            System.out.println("This is Thread 2");
        }
    }

    public static void main(String[] args) {

        // Creating Threads
        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread2();

        // Executing them
        thread1.start();
        thread2.start();
    }

 */ // End Sample 2

/* // Sample 3
    //=====================================================
    //  Creating 2 threads using sleep() + Using Priority
    //=====================================================

    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000); // one second
            } catch (InterruptedException e) {
                System.out.println("run()\t" + e.getMessage());
            }
            System.out.println(currentThread().getName() + " -> " + i);
        }
    }

    public static void main(String[] args) {
        // Creating Threads
        ExtendingThread thread1 = new ExtendingThread();
        ExtendingThread thread2 = new ExtendingThread();

        // Set Priority
        thread1.setPriority(1);
        thread2.setPriority(10);

        // Give names to threads
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        // Executing them
        thread1.start();
        thread2.start();

        // 20:53 https://www.youtube.com/watch?v=Yk7BXaotJ24

    }

*/ // End Sample 3

/* // Sample 4

    //=====================================================
    //  Creating 3 threads using join() + sleep()
    //=====================================================

    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000); // one second
            } catch (InterruptedException e) {
                System.out.println("run()\t" + e.getMessage());
            }
            System.out.println(currentThread().getName() + " -> " + i);
        }
    }

    public static void main(String[] args) {
        ExtendingThread thread1 = new ExtendingThread();
        ExtendingThread thread2 = new ExtendingThread();
        ExtendingThread thread3 = new ExtendingThread();

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread3.setName("Thread 3");

        thread1.start();
        try {
            thread1.join(3000); // 3 seconds
        } catch (InterruptedException e) {
            System.out.println("Error:\t" + e.getMessage());
        }
        thread2.start();
        thread3.start();
    }

*/ // End Sample 3

}
