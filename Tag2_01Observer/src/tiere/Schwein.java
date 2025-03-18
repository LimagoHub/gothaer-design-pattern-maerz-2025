package tiere;

import event.*;


import event.PropertyChangedEvent;

import java.util.ArrayList;
import java.util.List;

public class Schwein {

    private List<PigTooFatListener> listeners = new ArrayList<>();
    private List<PropertyChangedListener> propertyChangedListeners = new ArrayList<>();

    public void addPigTooFatListener(PigTooFatListener listener){
        listeners.add(listener);
    }
    public void removePigTooFatListener(PigTooFatListener listener){
        listeners.remove(listener);
    }

    public void addPropertyChangedListener(PropertyChangedListener listener){
        propertyChangedListeners.add(listener);
    }
    public void removePropertyChangedListener(PropertyChangedListener listener){
        propertyChangedListeners.remove(listener);
    }


    private void firePropertyChanged(final String propertyName, final Object oldValue, final Object newValue) {
        firePropertyChanged(new PropertyChangedEvent(this, propertyName, oldValue, newValue));
    }
    private void firePropertyChanged(final PropertyChangedEvent e){
        propertyChangedListeners.forEach(listener->listener.propertyChanged(e));
    }

    private void firePigTooFatEvent() {
        listeners.forEach(c->c.pigTooFat(this));
    }


    private String name;
    private int gewicht;


    public Schwein() {
        this("nobody");
    }

    public Schwein(final String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        var event = new PropertyChangedEvent(this, "name", this.name, name);
        this.name = name;
        firePropertyChanged(event);
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        firePropertyChanged("gewicht", this.gewicht, this.gewicht = gewicht);
        if(gewicht > 20)firePigTooFatEvent();
    }
    public void fuettern() {
        setGewicht(getGewicht() +1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}
