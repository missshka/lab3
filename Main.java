import Creatures.Astrologer;
import Creatures.KnowingBoy;
import Creatures.ShortyOne;
import Creatures.ShortyTwo;
import Enums.Poses;
import Places.Cave;
import Stuff.Reason;
import Stuff.Thing;

public class Main {
    public static void main(String[] args) {

        Astrologer astrologer = new Astrologer();
        KnowingBoy knowingBoy = new KnowingBoy();
        ShortyOne shortyOne = new ShortyOne();
        ShortyTwo shortyTwo = new ShortyTwo();

        Cave cave = new Cave("cave", astrologer, knowingBoy, shortyOne, shortyTwo);

        System.out.println("Let’s check if " + knowingBoy.getName() + " is in the cave.");
        cave.checkIfInCave(knowingBoy);

        Reason weightlessness = new Reason("weightlessness");

        Thing device = new Thing("weightlessness device");
        Thing weights = new Thing("weights");

        shortyOne.affectByWeightlessness();
        shortyTwo.affectByWeightlessness();

        shortyOne.soar(weightlessness);
        shortyTwo.soar(weightlessness);

        shortyOne.fly(Poses.bomb);
        shortyTwo.fly(Poses.soldier);

        shortyOne.getDown();
        shortyTwo.getDown();

        System.out.println(astrologer.getName() + " is " + astrologer.getWeightlessness() + " by the weightlessness");
        System.out.println(knowingBoy.getName() + " is " + knowingBoy.getWeightlessness() + " by the weightlessness");

        astrologer.work();
        knowingBoy.work();

        astrologer.move(device);

        astrologer.checkValue(weights);
    }
}
