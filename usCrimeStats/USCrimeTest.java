/*
 * File: USCrimeTest.java
 * Author: Alex Bailey
 * Date: 2 MAR 18
 * Purpose: Test class for the USCrime and CrimeStat classes
 */

import java.time.Instant;
import java.time.Duration;

public class USCrimeTest {
    public static void main(String[] args) {
        // vars
        String fileName;

        // get start time of program
        Instant start = Instant.now();
        if (args.length < 1) {
            System.out.println("Please provide a filename with crime data, exiting now");
            System.exit(0);
        }
        fileName = args[0];
        // create new USCrime object that contains the crime data in a HashMap
        USCrime crimeDB = new USCrime(fileName);
        // calls the printMenu() that loops over the menu option
        crimeDB.printMenu();
        // get end time of program
        Instant end = Instant.now();
        Duration runTime = Duration.between(start, end);
        System.out.println("Elapsed time in seconds was: " + runTime.getSeconds());
    }
}
