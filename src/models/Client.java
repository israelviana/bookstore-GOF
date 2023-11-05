package models;

import interfaces.EventListener;

public class Client implements EventListener {

    @Override
    public void update(String eventMessage) {
        System.out.println(eventMessage);
    }
}
