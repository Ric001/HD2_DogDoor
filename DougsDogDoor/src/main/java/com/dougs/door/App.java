package com.dougs.door;



public class App 
{
    public static void main( String[] args )
    {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside....");
        remote.pressButton();
        System.out.println("\nFido has gone outside.....");
        remote.pressButton();
        System.out.println("\nFido has done...");
        remote.pressButton();
        System.out.println("Fido's back inside...");

    }
}
