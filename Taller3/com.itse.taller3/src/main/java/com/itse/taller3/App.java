package com.itse.taller3;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Singleton
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); // true
        s1.showMessage();

        //Adapter
        ITarget target = new Adapter(new Adaptee());
        System.out.println(target.request());

        //Observer
        Subject subject = new Subject();

        Observer obs1 = new ConcreteObserver("Observador 1");
        Observer obs2 = new ConcreteObserver("Observador 2");

        subject.attach(obs1);
        subject.attach(obs2);

        subject.setState("Estado cambiado");
    }
}
