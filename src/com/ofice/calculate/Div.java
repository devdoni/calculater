package com.ofice.calculate;

public class Div {
    Num num1;
    Num num2;

    public Div(Num num1, Num num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double div() {
        System.out.println("div()");

        return num1.num / (double)num2.num;

    }

}
