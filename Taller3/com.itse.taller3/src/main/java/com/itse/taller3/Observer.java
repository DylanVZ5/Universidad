package com.itse.taller3;

import java.util.ArrayList;
import java.util.List;

// Observador
interface Observer {
    void update(String message);
}

// Sujeto (observable)
class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (Observer o : observers) {
            o.update(state);
        }
    }
}

// Observador concreto
class ConcreteObserver implements Observer {
    private final String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " recibió el mensaje: " + message);
    }
}