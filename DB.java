/*
 * File: DB.java
 * Author: Alex Bailey
 * Date: 25 FEB 18
 * Purpose: Creates an arraylist of State objects.
 * Methods: searchArray searches the stateInfoList array for the name
 * provided by the user; setTrackSearches adds State objects that were searched by the user;
 * buildStateInfoArray builds the array from states, birds, and flower array
 */

import java.util.ArrayList;

public class DB {
    // vars
    private ArrayList<State> stateInfoList = new ArrayList<>();
    private ArrayList<State> trackSearches = new ArrayList<>();

    private String[] states = new String[]{"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};

    private String[] birds = new String[]{"Yellowhammer", "Willow Ptarmigan", "Cactus Wren", "Mockingbird", "California Quail", "Lark Bunting", "American Robin", "Blue Hen Chicken", "Mockingbird", "Brown Thrasher", "Nene", "Mountain Bluebird", "Cardinal", "Cardinal", "Eastern Goldfinch", "Western Meadowlark", "Cardinal", "Brown Pelican", "Chickadee", "Baltimore Oriole", "Black-capped Chickadee", "American Robin", "Common Loon", "Mockingbird", "Eastern Bluebird", "Western Meadowlark", "Western Meadowlark", "Mountain Bluebird", "Purple Finch", "Eastern Goldfinch", "Roadrunner", "Eastern Bluebird", "Cardinal", "Western Meadowlark", "Cardinal", "Scissor-tailed Flycatcher", "Western Meadowlark", "Ruffed Grouse", "Rhode Island Red Hen", "Carolina Wren", "Ring-necked Pheasant", "Mockingbird", "Mockingbird", "California Seagull", "Hermit Thrush", "Northern Cardinal", "Willow Goldfinch", "Cardinal", "Robin", "Western Meadowlark"};

    private String[] flowers = new String[]{"Camellia", "Forget Me Not", "Saguaro Cactus Blossom", "Apple Blossom", "California Poppy", "Rocky Mountain Columbine", "Mountain laurel", "Peach Blossom", "Orange Blossom", "Cherokee Rose", "Pua Aloalo", "Syringa - Mock Orange", "Purple Violet", "Peony", "Wild Prairie Rose", "Sunflower", "Goldenrod", "Magnolia", "White pine cone and tassel", "Black-eyed susan", "Trailing-Arbutus", "Apple Blossom", "Pink and white lady's-slipper", "Magnolia", "Hawthorn", "Bitterroot", "Goldenrod", "Sagebrush", "Purple lilac", "Violet", "Yucca flower", "Rose", "American Dogwood", "Wild Prairie Rose", "Scarlet Carnation", "Mistletoe", "Oregon Grape", "Mountain Laurel", "Violet", "Yellow Jessamine", "Pasque Flower", "Iris", "Bluebonnet", "Sego lily", "Red Clover", "American Dogwood", "Coast Rhododendron", "Rhododendron", "Wood Violet", "Indian Paintbrush"};

    // constructors
    public DB() {
        buildStateInfoArray();
    }

    // searches the stateInfoList array for name provided by user
    public State searchArray(String name) {
        for (State s: stateInfoList) {
            String n = s.getName();
            if (n.toLowerCase().equalsIgnoreCase(name.toLowerCase())) {
                return s;
            }
        }
        return null;
    }
    // setter to add State object to array
    public void setTrackSearches(State state) {
        trackSearches.add(state);
    }

    // builds the stateInfoList array
    public void buildStateInfoArray() {
        String name;
        String bird;
        String flower;
        for (int i=0; i<states.length; i++){
            name = states[i];
            bird = birds[i];
            flower = flowers[i];
            stateInfoList.add(new State(name, bird, flower));
        }
    }

    // prints all 50 state attributes
    public void printAllStates(){
        for (State s: stateInfoList) {
            System.out.println(s.toString());
        }
    }

    // prints the summary of searches
    public void printSearches(){
        System.out.println("**** Thank you *****");
        System.out.println("A summary report for each State, Bird, and Flower is:");
        for(State s: trackSearches) {
            System.out.printf("%s, %s, %s\n", s.getName(), s.getBird(), s.getFlower());
        }
        System.out.println("Please visit our site again!\n");
    }

}
