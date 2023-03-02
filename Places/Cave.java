package Places;

import Creatures.Creature;

import java.util.ArrayList;

public class Cave extends Place{
    public Cave(){
        super.setName("cave");
    }

    private ArrayList<Creature> visitors = new ArrayList<Creature>();

    public void checkIfInCave(Creature creature) {
        for (Creature c : visitors) {
            if (creature.equals(c)) {
                System.out.println(c.getName() + " is already in cave.");
            }

        }
    }


    public Cave(String sname, Creature... creatures){
        super.setName(sname);
        this.raidTheCave(creatures);
    }

    public void visitTheCave(Creature creature){
        System.out.println(creature.getName() + "entered the cave");
        creature.setPlace(this);
        visitors.add(creature);
    }

    public void raidTheCave(Creature... creatures){
        for(Creature c:creatures){
            visitors.add(c);
            c.setPlace(this);
            System.out.println(c.getName() + " came to the " + this.getName() + ".");
        }

    }


}
