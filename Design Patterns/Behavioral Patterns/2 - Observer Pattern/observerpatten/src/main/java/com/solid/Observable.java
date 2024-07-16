package com.solid;

// Also called Subject
public interface Observable {

    public void addObserver(Observer o);

    public void notifyAllObservers();
    
}
