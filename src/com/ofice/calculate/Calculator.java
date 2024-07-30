package com.ofice.calculate;

public class Calculator {

    public int add(Num num1, Num num2) {

        Add add = new Add(num1, num2);
        return add.add();
    }

    public int sub(Num num1, Num num2) {

        Sub sub = new Sub(num1, num2);
        return sub.sub();
    }

    public int mul(Num num1, Num num2) {

        Mul mul = new Mul(num1, num2);
        return mul.mul();
    }

    public double div(Num num1, Num num2) {

        Div div = new Div(num1, num2);
        return div.div();

    }
}
