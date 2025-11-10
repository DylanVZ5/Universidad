package com.itse.taller3;

// Interfaz esperada por el cliente
interface ITarget {
    String request();
}

// Clase con una interfaz diferente que queremos adaptar
class Adaptee {
    public String specificRequest() {
        return "Método del Adaptee adaptado";
    }
}

// Adaptador que implementa la interfaz que el cliente espera
class Adapter implements ITarget {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        return adaptee.specificRequest();
    }
}
