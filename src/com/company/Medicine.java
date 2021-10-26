package com.company;

public class Medicine extends Thread {

    String name;
    int times;

    public Medicine (String name, int times){
        this.name = name;
        this.times = times;
    }

    public void run(){
        //while (!Thread.interrupted()) {
            try {
                Thread.sleep(60000 / times);
                System.out.println("Take " + name + " now!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        //}
    }
}
