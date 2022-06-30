package HW2;

public class Creature {

    String name;
    String description;
    Room aroom;

    public Creature(String name, String description, Room aroom) {
        this.name = name;
        this.description = description;
        this.aroom = aroom;

    }

    public String toString(){
        
        return name;
    }




    public void state () {

    }

    public void leave () {

    }

    public void enter () {

    }

   
}
