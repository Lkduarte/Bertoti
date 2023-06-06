package EngenhariadeSoftwareIII.Observer.Codigos;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private List<Observer> observers = new ArrayList<Observer>();
    private String magazine;

    public String getEstado() {
        return this.magazine;
    }

    public void setEstado(String estado) {
        this.magazine = estado;
        this.notificaTodosObservers();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notificaTodosObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}