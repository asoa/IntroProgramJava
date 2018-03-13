/*
 * File: State.java
 * Author: Alex Bailey
 * Date: 25 FEB 18
 * Purpose: State class that has name, bird and flower attributes
 */

public class State {
    // vars
    private String name;
    private String bird;
    private String flower;

    // constructors
    public State(String name, String bird, String flower){
        this.name = name;
        this.bird = bird;
        this.flower = flower;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    // methods
    public String toString() {
        String str =
                "Bird: " + bird + "\n" +
                "Flower: " + flower + "\n";
        return str;
    }
}
