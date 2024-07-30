package com.ofice.calculate;

public class Sub {

    Num num1;
    Num num2;

    public Sub(Num num1, Num num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sub() {
        System.out.println("sub()");

        return num1.num - num2.num;
    }
}
