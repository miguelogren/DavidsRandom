package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        String name = JOptionPane.showInputDialog("What is the medicine called?");
        int times = Integer.parseInt(JOptionPane.showInputDialog("How many times per minute?"));

        String name2 = JOptionPane.showInputDialog("What is the next medicine called?");
        int times2 = Integer.parseInt(JOptionPane.showInputDialog("How many times per minute?"));

        Medicine med1 = new Medicine(name, times);
        Medicine med2 = new Medicine(name2, times2);
        med1.start();

        //bromsar main tills med1 har slutat exekvera
        med1.join();


        med2.start();


    }
}
