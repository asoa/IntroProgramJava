/*
 * File: baileyWK7HW_Test.java
 * Author: Alex Bailey
 * Date: 25 FEB 18
 * Purpose: This is the test driver for the DB class that holds the state data
 */

import java.util.Scanner;

public class baileyWK7HW_Test {
    // vars
    public static String name;

    public static void main(String[] args) {
        // vars
        DB stateDB = new DB();
//        String name;
        State state;

        // prints all the states
        // stateDB.printAllStates();

        // prompt user for state name
        name = prompt();
        // while-loop continues until user enters "None"
        while(name != "None") {
            if(stateDB.searchArray(name) != null) {
                state = stateDB.searchArray(name);
                // adds State object to array setTrackSearches
                stateDB.setTrackSearches(state);
                System.out.println(state.toString());
                name = prompt();  // prompt user for input
            } else if (name.equals("None")){
               break;
            } else {
                prompt();
            }
        }
        // calls function to print out all the states that were searched
        stateDB.printSearches();
    }

    // prompts user for input, gets input and returns to caller
    public static String prompt() {
        System.out.println("Enter a State or None to exit");
        Scanner scIn = new Scanner(System.in);
        name = scIn.nextLine();
        return name;
    }
}
