package Creatures;

import Enums.Mood;
import Enums.Weightlessness;
import Places.Place;

import java.util.Objects;

public abstract class Creature{
    private String name;
    private Place place;
    private Mood mood;

    private Weightlessness weightlessness;


    public void setWeightlessness(Weightlessness weightlessness) {
        this.weightlessness = weightlessness;
    }

    public Weightlessness getWeightlessness() {
        return weightlessness;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public Mood getMood() {
        return mood;
    }

    public void setName(String sname){
        this.name = sname;
    }

    public String getName() {
        return name;
    }
    public void setPlace(Place splace){
        this.place = splace;
    }

    public Place getPlace() {
        return place;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Creature creature = (Creature) otherObject;
        return Objects.equals(name, creature.name)
                && Objects.equals(this.getPlace(), creature.getPlace())
                && Objects.equals(this.getMood(), creature.getMood());

    }

    @Override
    public int hashCode() {
        return Objects.hash(place, name);
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                "[name='" + name + '\'' +
                ']';
    }
}
