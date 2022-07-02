package com.learning;

public class Main {

    // Scope - function scope

    // Stack

    // Heap

    public static void main(String[] args) {
	    int x = 23;
        int y = 25;
        String frank = "Franklin";
        int sum = add(x, y);

        System.out.println(sum);
    }

    static int add(int x, int y){

        return x + y;
    }
}
