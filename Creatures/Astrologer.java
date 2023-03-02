package Creatures;

import Enums.Mood;
import Enums.Weightlessness;
import Interfaces.CheckableValue;
import Interfaces.Movable;
import Interfaces.Workable;
import Stuff.Thing;

import java.lang.reflect.AccessibleObject;

public class Astrologer extends Creature implements Workable, Movable, CheckableValue {
    public Astrologer(){
        super.setMood(Mood.neutral);
        super.setName("Zvezdochkin");
        super.setWeightlessness(Weightlessness.notAffected);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " continued working.");
    }

    @Override
    public void move(Thing thing) {
        System.out.println(this.getName() + " has moved the " + thing.getName());
    }

    @Override
    public void checkValue(Thing thing) {
        System.out.println(this.getName() + " has checked the value on the " + thing.getName());
    }
}
