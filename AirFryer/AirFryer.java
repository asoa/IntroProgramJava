/*
 * File: AirFryer.java
 * Author: Alex Bailey
 * Date: 16 FEB 18
 * Purpose: Mimics the function of an Air Fryer with three settins to cook chicken,
 * fish, or steak
 */

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class AirFryer {
    // private vars
    private LocalTime time = LocalTime.now();
    private Map<String,Integer> cookingTimes = new HashMap<String,Integer>();

    // public vars
    boolean isOn = false;

    // default constructor
    public AirFryer() {
        isOn = true;
        cookingTimes.put("chicken", 20);
        cookingTimes.put("fish", 10);
        cookingTimes.put("steak", 30);
    }

    public Map<String, Integer> getCookingTimes() {
        return cookingTimes;
    }

    public Integer getCookingTimes(String meat) {
        return cookingTimes.get(meat);
    }


    public String getEndTime(LocalTime startTime, String meat) {
        LocalTime endTime = startTime.plus(Duration.ofMinutes(getCookingTimes(meat)));
        return endTime.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public void printCookingTimes() {
        System.out.println("***** Cooking Times *****");
        for(Map.Entry<String,Integer> entry: this.getCookingTimes().entrySet()) {
            String entree = entry.getKey();
            Integer minutes = entry.getValue();
            System.out.println(entree + ":" + minutes);
        }
    }

    public String formatTime(LocalTime time) {
        return time.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public void cook(String meat) {
        System.out.println("\n***** Cooking Now *****");
        LocalTime startTime = time;
        String endTime = getEndTime(startTime, meat);
        System.out.printf("Started cooking %s at %s\n", meat, formatTime(startTime));
        System.out.printf("%s will be done at %s\n", meat, endTime);
    }
}
