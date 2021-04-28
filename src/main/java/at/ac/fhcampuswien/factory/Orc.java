package at.ac.fhcampuswien.factory;

public abstract class Orc {
    abstract String attackRoar();
    abstract int attackPower();
    abstract int weight();

    public int calculateAttackStrength(){
        return this.attackPower() * this.weight();
    }

    public String getType(){
        return this.getClass().getSimpleName();
    }
}
