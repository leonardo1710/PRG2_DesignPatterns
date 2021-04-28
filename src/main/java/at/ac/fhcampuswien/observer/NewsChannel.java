package at.ac.fhcampuswien.observer;

public class NewsChannel implements Subscriber {
    private String news;
    private static int instanceCounter = 0; // class variable to count overall instances
    private int channelId = 0;  // channelId for specific channel instance

    public NewsChannel(){ instanceCounter++; channelId = instanceCounter; }

    @Override
    public void update(Object o) {
        this.news = o.toString();
        System.out.println("NewsChannel " + channelId + " was notified. News: " + getNews());
    }

    public String getNews(){
        return news;
    }
}
