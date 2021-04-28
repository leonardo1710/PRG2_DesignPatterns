package at.ac.fhcampuswien;

import at.ac.fhcampuswien.adapter.AstonMartinVantage;
import at.ac.fhcampuswien.adapter.Movable;
import at.ac.fhcampuswien.adapter.MovableAdapter;
import at.ac.fhcampuswien.adapter.MovableAdapterImpl;
import at.ac.fhcampuswien.factory.Orc;
import at.ac.fhcampuswien.factory.OrcFactory;
import at.ac.fhcampuswien.observer.NewsAgency;
import at.ac.fhcampuswien.observer.NewsChannel;
import at.ac.fhcampuswien.singleton.Singleton;

public class App {
    public static void main(String[] args){
        showFactoryExample();
        showSingletonExample();
        showObserverExample();
        showAdapterExample();
    }

    /**
     * The Factory Design Pattern or Factory Method Design Pattern is one of the most used design patterns in Java.
     *
     * According to GoF, this pattern “defines an interface for creating an object, but let subclasses decide which class to instantiate.
     * The Factory method lets a class defer instantiation to subclasses”.
     *
     * This pattern delegates the responsibility of initializing a class from the client to a particular factory class
     * by creating a type of virtual constructor.
     *
     * To achieve this, we rely on a factory which provides us with the objects, hiding the actual implementation details.
     * The created objects are accessed using a common interface.
     */
    public static void showFactoryExample(){
        OrcFactory factory = new OrcFactory();

        Orc orc1 = factory.getOrc("URUKHAI");   // let the factory instantiate the concrete object
        Orc orc2 = factory.getOrc("SNAGA");
        Orc orc3 = factory.getOrc("SNUFFLER");

        System.out.println("Type of orc: " + orc1.getType() + " attack strenght: " + orc1.calculateAttackStrength());
        System.out.println("Type of orc: " + orc2.getType() + " attack strenght: " + orc2.calculateAttackStrength());
        System.out.println("Type of orc: " + orc3.getType() + " attack strenght: " + orc3.calculateAttackStrength());
    }

    /**
     * Observer is a behavioral design pattern. It specifies communication between objects: observable and observers.
     * An observable is an object which notifies observers about the changes in its state.
     *
     * For example, a news agency can notify channels when it receives news.
     * Receiving news is what changes the state of the news agency, and it causes the channels to be notified.
     */
    public static void showObserverExample(){
        NewsAgency agency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();

        agency.addSubscriber(channel1);
        agency.setNews("Today's news!!");
        agency.addSubscriber(channel2);
        agency.setNews("Tomorrow's news!!");
    }

    /**
     * Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".
     *
     * In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.
     */
    public static void showSingletonExample(){
        // Singleton s1 = new Singleton();  // doesnt work because of private constructor
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
    }

    /**
     * An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.
     * An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface.
     *
     * The main motive behind using this pattern is to convert an existing interface
     * into another interface that the client expects.
     * It's usually implemented once the application is designed.
     */
    public static void showAdapterExample(){
        Movable astonMartin = new AstonMartinVantage();
        MovableAdapter adapter = new MovableAdapterImpl(astonMartin);

        System.out.println("In mph: " + astonMartin.getSpeed());
        System.out.println("In kmh: " + adapter.getSpeed());
    }

}
