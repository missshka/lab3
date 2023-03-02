package Creatures;

import Enums.Mood;
import Enums.Weightlessness;
import Interfaces.Workable;

public class KnowingBoy extends Creature implements Workable {
    public KnowingBoy(){
        super.setMood(Mood.neutral);
        super.setName("Znaika");
        super.setWeightlessness(Weightlessness.notAffected);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " continued working.");
    }
}
