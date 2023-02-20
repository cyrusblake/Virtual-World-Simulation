package com.company;

public class Creature {
    String name;
    String description;
    String rName;
    Room rReference;

    // No Argument Constructor
    public Creature() {}

    // Argument Constructor
    public Creature(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // name getter and setter methods
    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    // description getter and setter methods

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    // room name getter and setter methods
    public String getRName() { return rName; }

    public void setRName(String rName) { this.rName = rName; }

    // room reference getter and setter method
    public Room getReference() { return rReference; }

    public void setReference(Room rReference) { this.rReference = rReference; }

    // toString method
    public String toString() {
        return name;
    }

    // change state of room
    public void state(Room r, String choice){
        if (choice.equals("clean")) {
            if (r.state.equals("dirty"))  {
                r.state = "clean";
            } else if (r.state.equals("half dirty"))  {
                r.state = "clean";
            }  else {
                System.out.println("Room is already clean.");
            }
        }

        if (choice.equals("dirty")) {
            if (r.state.equals("clean"))  {
                r.state = "dirty";
            } else if (r.state.equals("half dirty"))  {
                r.state = "dirty";
            }  else {
                System.out.println("Room is already dirty.");
            }
        }

    }

    // enter room
    public void enter(){}

    //
    public void leave(){}


}