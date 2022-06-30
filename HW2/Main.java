package HW2;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {

        Room r1 = new Room ("Blue", "clean", "the blue room");
        Room r2 = new Room ("Red", "dirty", "the red room");
        Room r3 = new Room ("Purple", "half-dirty", "the purple room");
        Room r4 = new Room ("Black", "clean", "the black room");
        Room r5 = new Room ("Green", "dirty", "the green room");

        r1.south = r2;
        r1.north = r4;
        r1.east = r5;
        r1. west = r3;

        r2.north = r1;
        r3.east = r1;
        r4.south = r1;
        r5.west = r1;

        Creature a1 = new Animal("Pig", "this is a pig", r1);
        Creature a2 = new Animal("Cat", "this is a cat", r2);
    
        r1.addCreature(a1);
        r2.addCreature(a2);

        Scanner command = new Scanner(System.in);

        PC c1 = new PC("Cyrus", "He is a Software Engineer", r3);
        r3.addCreature(c1);
        //System.out.println("Hello World");


        //c1.play(command);

       
        
        System.out.println(r1);
        System.out.println(r3);
        c1.north(c1);   
        //c1.look();  
        System.out.println(r1);   
       
        
                
    }
    
}
