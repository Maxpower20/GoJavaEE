package Module3;


import Module3.Implementation.SemaphoreImpl;
import Module3.Intefaces.Semaphore;

public class Runner {

    private  final Semaphore semaphore = new SemaphoreImpl(4);

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.test();
    }

    private void test(){
        for (int i = 0; i < 10; i++) {
            new Thread(new Worker()).start();
        }
    }

    private class Worker implements Runnable{

        @Override
        public void run() {

            try {

                System.out.println("Thread " + Thread.currentThread().getName() + " started");
                Thread.sleep(2000);
                semaphore.acquire(3);

                System.out.println("Threads available: " + semaphore.getAvailablePermits());

                semaphore.release(2);
                System.out.println("Threads " + Thread.currentThread().getName() + " available after releasing");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
