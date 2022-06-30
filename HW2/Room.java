package HW2;

import java.util.Arrays;
import java.util.Scanner;

public class Room {

    String name;
    String state;
    String description;
    
    Room north;
    Room south;
    Room west;
    Room east;

    Creature [] RA = new Creature[10];

    public Room (String name, String state, String description){
        this.name = name;
        this.state = state;
        this.description = description;
      
    }

    public String toString () {

        return  Arrays.toString(RA);
    }

    public void addCreature (Creature a) {

        for (int i=0; i<RA.length; i++) { 
            if (RA[i] == null) {
                RA[i] = a;
                break;                      
            } else {
                System.out.println("Room is full");
            }
        }
    }
}
