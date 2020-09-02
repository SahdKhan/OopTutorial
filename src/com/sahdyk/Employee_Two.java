package com.sahdyk;

public class Employee_Two {

    public static void main(String[] args){
        Employee sahdyk = new Employee(50_000, 25);
        int wage = sahdyk.calculateWage();
        System.out.println(wage);
    }
    /*
        TextBox textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        TextBox textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
        */
}
