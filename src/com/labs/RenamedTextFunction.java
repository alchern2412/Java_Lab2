package com.labs;

public class RenamedTextFunction {
    public int Test;

    public int getTest() {
        return Test;
    }

    public void setTest(int test) {
        Test = test;
    }

    public void TextFunction() {
        System.out.println("RenamedTextFunction printing...");
    }

    public void PrintCycle(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

}
