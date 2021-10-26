package queue.excercise;

import java.util.ArrayList;

public class Queue extends Thread{

    public ArrayList<Object> arr = new ArrayList<>();

    public synchronized void put(Object obj){
        arr.add(obj);
        notify();
    }

    public synchronized Object take(){
        while (arr.isEmpty()){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        Object obj = arr.get(0);
        arr.remove(0);
        return obj;
    }

}
