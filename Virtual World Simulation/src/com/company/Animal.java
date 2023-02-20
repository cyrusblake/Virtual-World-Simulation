package com.company;

public class Animal extends Creature {

    // No Argument Constructor
    public Animal() {}

    // Argument constructor
    public Animal(String name, String description) { super(name, description); }

    // toString method
    public String toString (){ return super.toString(); }
}
