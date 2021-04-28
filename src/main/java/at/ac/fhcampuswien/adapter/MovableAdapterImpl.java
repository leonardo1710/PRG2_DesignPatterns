package at.ac.fhcampuswien.adapter;

public class MovableAdapterImpl implements MovableAdapter{
    private final Movable car;

    public MovableAdapterImpl(Movable movable){
        this.car = movable;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMH(this.car.getSpeed());
    }

    private double convertMPHtoKMH(double mph){
        return mph * 1.60934;
    }
}


