package at.ac.fhcampuswien.factory;

public class Snaga extends Orc{

    @Override
    public String attackRoar() {
        return "Mhhh..ust kill Hobbits! Argh";
    }

    @Override
    public int attackPower() {
        return 4;
    }

    @Override
    int weight() {
        return 80;
    }
}
