package Creatures;

import  Enums.Mood;
import Enums.Poses;
import Enums.Weightlessness;
import Interfaces.AffectingWeightlessness;
import Interfaces.Flyable;
import Interfaces.GettingDown;
import Interfaces.Soarable;
import Stuff.Reason;

public class ShortyOne extends Creature implements Soarable, Flyable, GettingDown, AffectingWeightlessness {
    public ShortyOne(){
        super.setMood(Mood.neutral);
        super.setName("Anna");
        super.setWeightlessness(Weightlessness.notAffected);
    }


    @Override
    public void soar(Reason reason) {
        System.out.println(this.getName() + " soared to the ceilling because of the " + reason.getReason() + ".");
        this.setMood(Mood.perplexed);
        System.out.println(this.getName() + " got " + this.getMood());
    }

    @Override
    public void fly(Poses pose) {
        System.out.println(this.getName() + " is now flying in the pose of " + pose.name());
    }

    @Override
    public void getDown() {
        System.out.println(this.getName() + " is trying to get down.");
        this.setMood(Mood.sad);
        System.out.println(this.getName() + " got " + this.getMood() + " trying to get down(");
    }

    @Override
    public void affectByWeightlessness() {
        this.setWeightlessness(Weightlessness.affected);
        System.out.println(this.getName() + " was affected by weightlessness");
    }
}
