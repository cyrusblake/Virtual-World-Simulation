package com.company;

public class NPC extends Creature {

    // No Argument Constructor
    public NPC() {}

    // Argument constructor
    public NPC(String name, String description) { super(name, description); }

    // toString method
    public String toString (){ return super.toString(); }
}
