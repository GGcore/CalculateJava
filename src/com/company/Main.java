package com.company;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        Reader r = new Reader("Калькулятор");
        r.setVisible(true);
        r.setSize(240, 225);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setResizable(false);
        r.setLocationRelativeTo(null);
    }
}
