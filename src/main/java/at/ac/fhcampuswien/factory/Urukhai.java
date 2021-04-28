package at.ac.fhcampuswien.factory;

public class Urukhai extends Orc{
    @Override
    public String attackRoar() {
        return "ROOOOAR";
    }

    @Override
    public int attackPower() {
        return 10;
    }

    @Override
    int weight() {
        return 200;
    }
}
