package com.company;

public class PC extends Creature {
    int respect;

    // No Argument Constructor
    public PC() {}

    // Argument constructor
    public PC(String name, String description, int respect) {
        super(name, description);
        this.respect = respect;
    }

    public void help() {
        System.out.println("\nhelp - consist of the full list of commands");
        System.out.println("look - outputs information about the room the user is in ");
        System.out.println("clean - changes the state of the room to clean ");
        System.out.println("dirty - changes the state of the room to dirty ");
        System.out.println("north, south, east, west - PC leaves current room");
        System.out.println("exit, quit - print Goodbye and quit the program\n");
    }

    public void look(Room r) {
        System.out.println(r);

    }

    // toString method
    public String toString (){ return super.toString(); }
}
