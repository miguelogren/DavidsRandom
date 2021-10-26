package queue.excercise;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Boolean go = true;
        Queue queue1 = new Queue();

       // while (go){

            ArrayList<Producer> prodArr = new ArrayList<>();
            ArrayList<Consumer> consArr = new ArrayList<>();

            int producers = Integer.parseInt(JOptionPane.showInputDialog("How many producers?"));
            int consumers = Integer.parseInt(JOptionPane.showInputDialog("How many consumers?"));
            int interval;
            String string;
            int pulling;

            for (int i=0; i<producers; ++i){
                interval = Integer.parseInt(JOptionPane.showInputDialog("How often should items be added for producer " + (i+1) + "?"));
                string = JOptionPane.showInputDialog("What should be added?");
                Producer pro = new Producer(string, interval, queue1);
                prodArr.add(pro);
            }
            for (int j=0; j<consumers; ++j){
                pulling = Integer.parseInt(JOptionPane.showInputDialog("How often should items be pulled by consumer " + (j+1) +"?"));
                Consumer cons = new Consumer(pulling, queue1);
                consArr.add(cons);
            }
            for (Producer pro: prodArr){
                pro.start();
            }
            for (Consumer cons:consArr) {
                cons.start();
            }

            Thread.sleep(10000);
       // }


    }
}
