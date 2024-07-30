package com.ofice.calculate;

import java.util.Scanner;

public class MainCls {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        Num num1 = new Num(scanner.nextInt());
        System.out.println("Enter the second number: ");
        Num num2 = new Num(scanner.nextInt());

        int addResult = calculator.add(num1,num2);
        System.out.println("addResult: " + addResult);

        int subResult = calculator.sub(num1,num2);
        System.out.println("subResult: " + subResult);

        int mulResult = calculator.mul(num1,num2);
        System.out.println("subResult: " + mulResult);

        double divResult = calculator.div(num1,num2);
        System.out.println("divResult: " + divResult);

    }
}
