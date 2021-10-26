package queue.excercise;

public class Producer extends Thread {

    String string;
    int time;
    Queue queue;

    public Producer(String s, int time, Queue q){
        string = s;
        this.time = time;
        queue = q;
    }

    public void run (){
        while(true) {
            try {
                Thread.sleep(time * 1000);
                queue.put(string);
                System.out.println("Adding - " + string);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
