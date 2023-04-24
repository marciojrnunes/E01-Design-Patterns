package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void add(Observer observer) {
//        Adciona um observer para ser notificado posteriormente
        this.observers.add(observer);
    }

    public void notifyObservers() {
//        notifica observers adicionados
        for(Observer o: observers) {
            o.update(Subject.this);
        }
    }

}

