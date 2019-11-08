public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("#1");
        myThread.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.print("This is Thread:\t");
        showName();
    }

    private void showName(){
        System.out.println(Thread.currentThread().getName());
    }
}
