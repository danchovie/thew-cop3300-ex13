/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex13;

import jdk.jfr.DataAmount;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	    Scanner newScanner = new Scanner(System.in);
        int principal, years, compound;
        double rate, amount_at_end;
        System.out.print("What is the principal amount? ");
        principal = newScanner.nextInt();
        System.out.print("What is the rate? ");
        rate = newScanner.nextDouble();
        System.out.print("What is the number of years? ");
        years = newScanner.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        compound = newScanner.nextInt();
        rate /= 100;
        amount_at_end = (double)principal*Math.pow((1+(rate/compound)),compound*years);
        System.out.printf("$%d invested at %.2f%% for %d years compounded %d times per years is $%.2f.", principal, rate*100, years, compound, amount_at_end);
    }
}
