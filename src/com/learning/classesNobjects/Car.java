package com.learning.classesNobjects;

// Class is a blueprint of an object
//
// Properties -> member variables
// What it can have
// seats
// tires
// engine
// make
// model
// year

// Functionality -> member functions
// What it can do
// go ahead
// go back
// can shift gear
// turn left
// turn right
// stop
// honk
public class Car {

    String make;
    String model;
    String year;
    int numberOfSeats;

    void honk() {
         System.out.println(this.model + " beep beep");
    }

    void shiftUp() {
        System.out.println(this.model + " Shift Up");
    }

    void shiftDown() {
        System.out.println(this.model + " Shift down");
    }
}
