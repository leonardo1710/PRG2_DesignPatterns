package at.ac.fhcampuswien.factory;

public class Snuffler extends Orc{

    @Override
    public String attackRoar() {
        return "Mhehehe";
    }

    @Override
    public int attackPower() {
        return 7;
    }

    @Override
    int weight() {
        return 40;
    }
}
