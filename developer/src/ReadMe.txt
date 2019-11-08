INTRODUCTION TO JAVA THREADS

Multithreading refers to two or more tasks executing concurrently within a single program.
A thread is an independent path of execution within a program.
Many threads can run concurrently within a program.
Every thread in Java is created and controlled by the java. lang. Thread class.
There is two steps to create thread.

1.	Create a class (for example, MyThread), and this class must extend Thread. 
2.  In this class, we need to create a run() method.

Everything that will be added to this method will be executed as a thread.
To use a thread, in the Main class need to create an object of the class (MyThread). Like shown in the sample. 

MyThread myThread = new MyThread();

and then all is left call method start() which will call method run() in our MyThread class.
