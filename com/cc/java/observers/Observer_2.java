package com.cc.java.observers;

import com.cc.java.Logger;
import com.cc.java.subject.Subject;

public class Observer_2 extends Observer{

    private Subject s;
    private String name;

    public Observer_2(Subject s, String name) {
        this.s = s;
        this.name = name;
        s.attach(this);
    }

    @Override
    public void update() {
        String str = name + ": observes, that subject changed its state to " + s.getState();
        Logger.ausgabe(str);
    }

    @Override
    public void update(String pushText) {
        String str = name + ": has been given the following information from the subject: " + pushText;
        Logger.ausgabe(str);
    }

    
    
}
