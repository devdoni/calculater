package com.ofice.calculate;

public class Add {

    Num num1;
    Num num2;

    public Add(Num num1, Num num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public int add() {
        System.out.println("add()");

        return num1.num + num2.num;
    }

}
