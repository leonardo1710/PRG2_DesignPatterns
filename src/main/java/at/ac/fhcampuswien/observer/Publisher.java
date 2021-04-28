package at.ac.fhcampuswien.observer;

public interface Publisher {
    void sendNotifications();
    <T extends Subscriber> void addSubscriber(T t);
    <T extends Subscriber> void removeSubscriber(T t);
    void update();
}


