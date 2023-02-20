package com.company;

import java.util.Arrays;

public class Room {
    String name;
    String state;
    String description;

    Creature[] rCreatures = new Creature[10];
    Room north;
    Room south;
    Room east;
    Room west;

    // No Argument Constructor
    public Room() {}

    // Argument Constructor
    public Room(String name, String state, String description){
        this.name = name;
        this.state = state;
        this.description = description;

    }

    // name getter and setter methods
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // state getter and setter methods
    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    // description getter and setter methods
    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    // add animal to room of animals method
    public void addCreature(Creature c, String r, Room rR) {

        for (int i = 0; i <= rCreatures.length; i++) {
            if (rCreatures[i] == null) {
                rCreatures[i] = c;
                c.setRName(r);
                c.setReference(rR);
                break;
            }
        }
    }

    // toString method
    public String toString(){
        return "Room: " + name + "\n" +
                "State: " + state + "\n" +
                "Description: " + description + "\n" +
                "Creatures: " + Arrays.toString(rCreatures);
    }



}
