package com.cc.java.observers;

public abstract class Observer {



    private boolean isNotifiedByPush;

    public boolean isNotifiedByPush() {
        return isNotifiedByPush;
    }

    public void setNotifiedByPush(boolean isNotifiedByPush) {
        this.isNotifiedByPush = isNotifiedByPush;
    }

    public abstract void update();

    public abstract void update(String pushText);

}
