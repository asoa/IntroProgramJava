/*
 * File: HeadPhone.java
 * Author: Alex Bailey
 * Date: 18 FEB 18
 * Purpose: Source file for HeadPhone class.  ChangeVolume() checks to see if the headphone's
 * attribute pluggedIn = true before attempting to change the volume.
 */

import java.util.Scanner;

public class HeadPhone {
    // vars
    private final int LOW = 1;
    private final int MEDIUM = 2;
    private final int HIGH = 3;
    private int VOLUME = MEDIUM;
    private boolean pluggedIn = false;
    private String manufacturer;
    private String headPhoneColor;
    private String headPhoneModel;

    // getters and setters
    public int getLOW() {
        return LOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getHIGH() {
        return HIGH;
    }

    public int getVOLUME() {
        return VOLUME;
    }

    public void setVOLUME(int VOLUME) {
        this.VOLUME = VOLUME;
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getHeadPhoneColor() {
        return headPhoneColor;
    }

    public void setHeadPhoneColor(String headPhoneColor) {
        this.headPhoneColor = headPhoneColor;
    }

    public String getHeadPhoneModel() {
        return headPhoneModel;
    }

    public void setHeadPhoneModel(String headPhoneModel) {
        this.headPhoneModel = headPhoneModel;
    } // end of getters and setters

    // constructors
    public HeadPhone(String color) {
        this(0, color);
    }

    public HeadPhone(int num, String color) {
        setHeadPhoneColor(color);
        setManufacturer("Bose");
        setHeadPhoneModel("Q30");
    }

    public HeadPhone() {
        setManufacturer("Bose");
        setHeadPhoneColor("Black");
        setHeadPhoneModel("Q35");
    }

    public HeadPhone(String manufacturer, String headPhoneColor, String headPhoneModel) {
        this.manufacturer = manufacturer;
        this.headPhoneColor = headPhoneColor;
        this.headPhoneModel = headPhoneModel;
    }  // end of constructors

    // returns string object of all attributes of the headphone object
    public String toString() {
        String str = "***** Current values of " + getHeadPhoneModel() + " *****:\n" +
                "Volume: " + VOLUME + "\n" +
                "PluggedIn: " + pluggedIn + "\n" +
                "Manufacturer: " + getManufacturer() + "\n" +
                "Color: " + getHeadPhoneColor() + "\n" +
                "Model: " + getHeadPhoneModel() + "\n";
        return  str;
    }

    // gets char input from user and returns true or false indicating an answer of yes or no
    public boolean getInput() {
        char answer;
        Scanner scIn = new Scanner(System.in);
        System.out.println("Enter Y|y or N|n");
        answer = scIn.next().charAt(0);
        if((answer == 'Y') || (answer == 'y')) {
            return true;
        }
        return false;
    }

    // checks to see if headphone is plugged in/connected before changing the volume
    public void changeVolume(int newVolume) {
        if ((newVolume < 1) || (newVolume > 3)) {
            System.out.println("Volume settings are 1-3, please try again.");
        } else if (pluggedIn == false) {
            System.out.println("The " + this.headPhoneModel + " headphones aren't plugged in/connected to bluetooth.  Do you want to plug them in/connect to bluetooth?");
            if(getInput() == true) {
                pluggedIn = true;
                System.out.println("The " + this.headPhoneModel + " is now connected.  Changing the volume to " + newVolume + "\n");
                setVOLUME(newVolume);
            } else {
                System.out.println("The " + this.headPhoneModel + " is still not plugged in, and the volume has not been changed.\n");
            }
        } else {
            this.VOLUME = newVolume;
        }

    }
}
