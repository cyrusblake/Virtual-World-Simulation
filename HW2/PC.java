package HW2;

import java.util.Scanner;

public class PC extends Creature {

    int respect = 40;
    //boolean truth = true;

    public PC(String name, String description, Room aroom) {
        super(name, description, aroom);
        
    }

    public String toString() {

        return super.toString();
    }

    public void play (Scanner s) {

        System.out.print("Enter play: ");
        String output = s.nextLine().toLowerCase();
        //System.out.println(output);

        while(!output.equals("play")){
            System.out.print("Please Enter play: ");
            output = s.nextLine().toLowerCase();

        }

        System.out.println("Enter one of these commands \" north, south, east, west, help, look, clean, dirty, look, quit \" ");
        output = s.nextLine().toLowerCase();

        while(!output.equals("help") && !output.equals("look")
        && !output.equals("clean") && !output.equals("dirty")
        && !output.equals("look")  && !output.equals("quit")) {
           
            System.out.print("Could not understand, please repeat the commands");
            output = s.nextLine().toLowerCase();
           
        }

        switch (output) {
            case "help":
                help();
                break;
            case "clean":
                clean();
                break;
            case "look":
                look();
                break;
            case "quit":
                quit();
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
        
    }

    public void north (Creature a) {

        

            aroom.addCreature(a);
            //a.aroom = aroom.north;

      
        


        /*
         
        for (int i=0; i<aroom.RA.length; i++) { 
            if (a.aroom.RA[i] == null) {
                aroom.addCreature(a);
                aroom = aroom.north;
                break;                      
            } else {
                System.out.println("Room is full");
            }
        }


         */
        
        
    }

    public void help () {

        System.out.println("This is the full list of command \" north, south, east, west, help, look, clean, dirty, look, quit \" ");

    }

    public void look () {

        System.out.println(aroom);

    }

    public void clean () {

        if(aroom.state.equals("dirty")) {
            aroom.state = "clean";
            
        }else if (aroom.state.equals("half-dirty")) {
            aroom.state = "clean";

        } else {
            System.out.println("The room is already clean");
        } 
    }

    public void dirty () {

        if(aroom.state.equals("clean")) {
            aroom.state = "dirty";
            
        }else if (aroom.state.equals("half-dirty")) {
            aroom.state = "dirty";

        } else {
            System.out.println("The room is already dirty");
        } 
    }
    
    public void quit () {
        
        System.out.println("Goodbye");
        System.exit(0);
    }


    
}
