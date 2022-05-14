package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observer.add(observer);
    }

    public void notifyObservers() {
        for (Observer atual : observers){
            atual.update(this);
        }
    }

}

