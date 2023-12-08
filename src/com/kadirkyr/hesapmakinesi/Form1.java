package com.kadirkyr.hesapmakinesi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame{
    private JTextField firstNumText;
    private JTextField secondNumText;
    private JPanel panel1;
    private JLabel resultLabel;
    private JButton sumButton;
    private JButton subtractButton;
    private JButton divButton;
    private JButton multipleButton;

    private double operations (char islem) {
        double result = 0;
        int firstNum = Integer.parseInt(firstNumText.getText());
        int secondNum =  Integer.parseInt(secondNumText.getText());

        switch (islem) {
            case '+':
                Sum sum = new Sum();
                result = sum.operation(firstNum,secondNum);
                break;
            case '-':
                Subt subt = new Subt();
                result = subt.operation(firstNum,secondNum);
                break;
            case '/':
                Division div = new Division();
                result = div.operation(firstNum,secondNum);
                break;
            case '*':
                Multiple multiple = new Multiple();
                result = multiple.operation(firstNum,secondNum);
                break;
        }
        return result;
    }


    Form1(){
        init();
    }

    private void init(){
        add(panel1);
        setSize(350,300);
        setTitle("Basit Hesap Makinesi");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText(String.valueOf("Sonuç: " +  operations('+')));
            }
        });
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText(String.valueOf("Sonuç: " + operations('-')));
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText(String.valueOf("Sonuç: " + operations('/')));
            }
        });
        multipleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText(String.valueOf("Sonuç: " + operations('*')));
            }
        });
    }
}

