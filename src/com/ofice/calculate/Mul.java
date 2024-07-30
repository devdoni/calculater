package com.ofice.calculate;

public class Mul {

    Num num1;
    Num num2;

    public Mul(Num num1, Num num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public int mul() {
        System.out.println("mul()");

        return num1.num * num2.num;
    }

}
