package queue.excercise;

public class Consumer extends Thread {

    int time;
    Queue queue;

    public Consumer(int time, Queue q){
        this.time = time;
        queue = q;
    }
    public void run(){
        while(true) {
            try {
                Thread.sleep(time * 1000);
                Object obj = queue.take();
                System.out.println("Taking - " + obj);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
