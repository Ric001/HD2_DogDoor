package com.dougs.door;

public class DogDoor {
    private boolean open; 

    public void open() {
        open = true;
        System.out.println("Door Opened");
    }

    public void close() {
        open = false;
        System.out.println("Door Closed");
    }

    public boolean isOpen() {
        return open;
    }
}