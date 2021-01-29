package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Reader extends JFrame {
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAllClean, bOnceClean, bElevate, bDivide, bMultiply, bMinus, bPlus, bEqually, bFractional, bChangeSign;
    JTextField t1;
    int i = 0, SUM = 0, DIF = 0, MUT = 0, DIV = 0, MAP = 0;
    String j, h, str;
    int a, b;


    eHandler handler = new eHandler();
    public Reader(String s) {
        super(s);
        setLayout(new FlowLayout());
        t1 = new JTextField(20);
        b0 = new JButton("  0  ");
        b1 = new JButton("  1 ");
        b2 = new JButton("  2  ");
        b3 = new JButton("  3  ");
        b4 = new JButton(" 4  ");
        b5 = new JButton("  5  ");
        b6 = new JButton("  6  ");
        b7 = new JButton(" 7  ");
        b8 = new JButton("  8  ");
        b9 = new JButton("  9  ");
        bAllClean = new JButton("AC");
        bOnceClean = new JButton(" С ");
        bElevate = new JButton("x^y");
        bDivide = new JButton("  /  ");
        bMultiply = new JButton("  *  ");
        bMinus = new JButton("  -  ");
        bPlus = new JButton("  + ");
        bEqually = new JButton("  =  ");
        bFractional = new JButton("  ,  ");
        bChangeSign = new JButton("+/- ");
        t1.setEditable(false);
        add(t1);
        add(bAllClean);
        add(bOnceClean);
        add(bElevate);
        add(bDivide);
        add(b7);
        add(b8);
        add(b9);
        add(bMultiply);
        add(b4);
        add(b5);
        add(b6);
        add(bMinus);
        add(b1);
        add(b2);
        add(b3);
        add(bPlus);
        add(bChangeSign);
        add(b0);
        add(bFractional);
        add(bEqually);

        b0.setBackground(Color.lightGray);
        b1.setBackground(Color.lightGray);
        b2.setBackground(Color.lightGray);
        b3.setBackground(Color.lightGray);
        b4.setBackground(Color.lightGray);
        b5.setBackground(Color.lightGray);
        b6.setBackground(Color.lightGray);
        b7.setBackground(Color.lightGray);
        b8.setBackground(Color.lightGray);
        b9.setBackground(Color.lightGray);
        bPlus.setBackground(Color.orange);
        bEqually.setBackground(Color.orange);
        bChangeSign.setBackground(Color.orange);
        bAllClean.setBackground(Color.ORANGE);
        bOnceClean.setBackground(Color.orange);
        bFractional.setBackground(Color.orange);
        bDivide.setBackground(Color.orange);
        bMultiply.setBackground(Color.orange);
        bMinus.setBackground(Color.orange);
        bElevate.setBackground(Color.orange);


        bAllClean.addActionListener(handler);
        bOnceClean.addActionListener(handler);
        bElevate.addActionListener(handler);
        bEqually.addActionListener(handler);
        bDivide.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        bMultiply.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        bMinus.addActionListener(handler);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        bPlus.addActionListener(handler);
        bChangeSign.addActionListener(handler);
        b0.addActionListener(handler);
        bFractional.addActionListener(handler);
        bElevate.addActionListener(handler);
    }

    public class eHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bAllClean) {
                t1.setText(null);
                i = 0;
            }
            if (e.getSource() == bOnceClean) {
                str = t1.getText();
                t1.setText(str.substring(0, str.length() - 1));
            }
            if (e.getSource() == b0) {
                t1.setText(t1.getText() + "0");
                i++;
            }
            if (e.getSource() == b1) {
                t1.setText(t1.getText() + "1");
                i++;
            }
            if (e.getSource() == b2) {
                t1.setText(t1.getText() + "2");
                i++;
            }
            if (e.getSource() == b3) {
                t1.setText(t1.getText() + "3");
                i++;
            }
            if (e.getSource() == b4) {
                t1.setText(t1.getText() + "4");
                i++;
            }
            if (e.getSource() == b5) {
                t1.setText(t1.getText() + "5");
                i++;
            }
            if (e.getSource() == b6) {
                t1.setText(t1.getText() + "6");
                i++;
            }
            if (e.getSource() == b7) {
                t1.setText(t1.getText() + "7");
                i++;
            }
            if (e.getSource() == b8) {
                t1.setText(t1.getText() + "8");
                i++;
            }
            if (e.getSource() == b9) {
                t1.setText(t1.getText() + "9");
                i++;
            }
            if (e.getSource() == bEqually) {
                h = t1.getText();
                b = Integer.parseInt(h);
                a = Integer.parseInt(j);
                if (SUM == 1) {
                    t1.setText(a + b + "");
                    SUM = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
                if (DIF == 1) {
                    t1.setText(a - b + "");
                    DIF = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
                if (DIV == 1) {
                    t1.setText(a / b + "");
                    DIV = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
                if (MUT == 1) {
                    t1.setText(a * b + "");
                    MUT = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
                if (MAP == 1) {
                    t1.setText(Math.pow(a, b) + "");
                    MAP = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
            }
            if (e.getSource() == bPlus) {
                j = t1.getText();
                t1.setText(null);
                SUM++;
            }
            if (e.getSource() == bMinus) {
                j = t1.getText();
                t1.setText(null);
                DIF++;
            }
            if (e.getSource() == bMultiply) {
                j = t1.getText();
                t1.setText(null);
                MUT++;
            }
            if (e.getSource() == bElevate) {
                j = t1.getText();
                t1.setText(null);
                MAP++;
            }
            if (e.getSource() == bDivide) {
                j = t1.getText();
                t1.setText(null);
                DIV++;
            }
        }
    }
}




