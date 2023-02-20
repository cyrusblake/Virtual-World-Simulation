package com.company;


import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Room r1 = new Room("Living Room", "clean", "White walls");

        PC c1 = new PC("Cyrus", "Software Engineer", 40);
        Animal c2 = new Animal("Cat", "Grey");
        NPC c3 = new NPC ("John", "Software Engineer");

        r1.addCreature(c1, r1.getName(), r1);
        r1.addCreature(c2, r1.getName(), r1);
        r1.addCreature(c3, r1.getName(), r1);

        Room r2 = new Room("Dinning Room", "dirty", "Grey walls");

        Animal c4 = new Animal("Dog", "White");
        Animal c5 = new Animal("Bird", "Yellow");
        NPC c6 = new NPC("Miles", "Software Engineer");

        r2.addCreature(c4, r2.getName(), r2);
        r2.addCreature(c5, r2.getName(), r2);
        r2.addCreature(c6, r2.getName(), r2);

        Room r3 = new Room("Bed Room", "half dirty", "Blue walls");

        Animal c7 = new Animal("Pig", "Pink");
        Animal c8 = new Animal("Racoon", "Grey");
        NPC c9 = new NPC("David", "Software Engineer");

        r3.addCreature(c4, r3.getName(), r3);
        r3.addCreature(c5, r3.getName(), r3);
        r3.addCreature(c6, r3.getName(), r3);

        start(c1);
    }

    static void start(PC p){


        //while(true) {}

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a command! If you don't know any enter help. ");
        String input = sc.nextLine();


        while ((!input.equals("help")) && (!input.equals("look"))
        && (!input.equals("clean")) && (!input.equals("dirty"))) {
            input = sc.nextLine();
        }


        if (input.equals("help")){
            p.help();
        } else if (input.equals("look")) {
            p.look(p.getReference());
        } else if (input.equals("clean")) {
            p.state(p.rReference, input);
        } else if (input.equals("dirty")) {
            p.state(p.rReference, input);
        }

        /**

        if (input.equals("exit")) {
            System.exit(0);
        }
         */
    }
}
