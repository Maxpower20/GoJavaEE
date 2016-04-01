package Module3_1.Implementation;

import Module3_1.Intefaces.Semaphore;


public class SemaphoreImpl implements Semaphore {

    private int sleepingThreads;
    private volatile int availableThreads;
    private final Object lock = new Object();

    public SemaphoreImpl(int threadNumber) {
        if (threadNumber <= 0) throw new IllegalArgumentException();
        this.availableThreads = threadNumber;
    }

    @Override
    public void acquire() throws InterruptedException {
        acquire(1);
    }

    @Override
    public void acquire(int permits) throws InterruptedException {
        synchronized (lock) {
            if (permits < 0 && permits > availableThreads) throw new IllegalArgumentException("Negative quantity of permits or permits are more than available threads");

            while (permits > 0) {
                permits--;
                sleepingThreads++;
                availableThreads--;
                lock.wait();
            }
        }
    }

    @Override
    public void release() {
        release(1);

    }

    @Override
    public void release(int permits) {
        synchronized (lock) {
            if (permits <= 0) throw new IllegalArgumentException("Must put a positive number of permits");

            while (permits > 0) {
                permits--;
                sleepingThreads--;
                availableThreads++;
                lock.notify();
                if (sleepingThreads == 0){
                    break;
                }
            }
        }
    }

    @Override
    public int getAvailablePermits() {
        return availableThreads;
    }
}
