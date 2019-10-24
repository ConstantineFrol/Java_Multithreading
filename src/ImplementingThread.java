public class ImplementingThread implements Runnable {

    //=====================================================
    //  Creating thread and setName() + setPriority()
    //=====================================================

    // Implementing method from interface Runnable
    @Override
    public void run() {
        System.out.println("Thread is running");
    }


    public static void main(String[] args) {

        // Creating object reference of this class
        ImplementingThread impThr1 = new ImplementingThread();
        // Creating thread class object
        Thread thr1 = new Thread(impThr1);
        // Setting Thread name
        thr1.setName("First Thread");
        System.out.println("Thread Name:\t" + thr1.getName());
        // Setting Thread Priority 1-10 (min - max)
        thr1.setPriority(Thread.MIN_PRIORITY);// or Thread.MAX_PRIORITY
        System.out.println("Priority:\t\t" + thr1.getPriority());
        // Running Thread
        thr1.start();
    }
}
