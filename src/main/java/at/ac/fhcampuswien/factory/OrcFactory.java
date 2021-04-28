package at.ac.fhcampuswien.factory;

public class OrcFactory {
    public Orc getOrc(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("URUKHAI")){
            return new Urukhai();
        } else if(type.equalsIgnoreCase("SNAGA")){
            return new Snaga();
        } else if(type.equalsIgnoreCase("SNUFFLER")){
            return new Snuffler();
        }
        return null;
    }
}


