package thread;

public class ProducerConsumer {
    int data;

    PC pc;

    public ProducerConsumer(PC pc) {
        this.pc = pc;
    }

    public class Thread1 extends Thread {
        @Override
        public void run() {

            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public class Thread2 extends Thread {
        @Override
        public void run() {

            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public void startThread() {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();




        try {
            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        PC pcObject = new PC();

        ProducerConsumer obj2 = new ProducerConsumer(pcObject);

        obj2.startThread();
        System.out.println("Main completed");
    }
}

class PC {

    public Boolean state = Boolean.TRUE;

    public void produce() throws InterruptedException {



        while (true) {
            synchronized (this) {

                if(state) {
                    System.out.print("Produce, ");
                    state = Boolean.FALSE;
                    notify();
                }else {
                    wait();
                }
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized(this) {
                if(!state) {
                    System.out.print("Consume, ");
                    state = Boolean.TRUE;
                    notify();
                }else {
                    wait();
                }
                Thread.sleep(1000);
            }
        }
    }
}
