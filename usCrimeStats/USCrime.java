/*
 * File: USCrime.java
 * Author: Alex Bailey
 * Date: 2 MAR 18
 * Purpose: Class instantiates a HashMap that contains the crime data.  The HashMap key is the year from each csv row,
 * and the value is the CrimeStat object that correlates to the year.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class USCrime {
    // vars
    Map<Integer, CrimeStat> crimeDB = new LinkedHashMap<Integer, CrimeStat>();
    BufferedReader inputStream = null;
    ArrayList<String> csvRows = new ArrayList<>();
    String rowData;
    Scanner scIn = new Scanner(System.in);
    String answer;


    // constructor
    public USCrime(String fileName) {
        File inFile = new File(fileName);
        getData(inFile);
        buildCrimeStatDB();
        // call menu()
    }

    // iterates over file and puts lines into ListArray
    private void getData(File fileName) {
        try {
            inputStream = new BufferedReader(new FileReader(fileName));
            inputStream.readLine(); // throw away the first line;
            while ((rowData = inputStream.readLine()) != null) {
                csvRows.add(rowData);
            }

        } catch (IOException io) {
            System.out.println("Error opening file: " + io.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException io) {
                System.out.println("Error closing inputStream: " + io.getMessage());
            }
        }
    }

    // initialize the map object; iterate over all items in ListArray; create CrimeStat objects
    private void buildCrimeStatDB() {
        for (String row : csvRows) {
            String[] data = row.split(",");  // split String on comma
            int year = Integer.parseInt(data[0]);
            int population = Integer.parseInt(data[1]);
            int violentCrime = Integer.parseInt(data[2]);
            double violentCrimeRate = Double.parseDouble(data[3]);
            int murderNnManslaughter = Integer.parseInt(data[4]);
            double murderNnManslaughterRate = Double.parseDouble(data[5]);
            int rape = Integer.parseInt(data[6]);
            double rapeRate = Double.parseDouble(data[7]);
            int robbery = Integer.parseInt(data[8]);
            double robberyRate = Double.parseDouble(data[9]);
            int aggAssault = Integer.parseInt(data[10]);
            double aggAssaultRate = Double.parseDouble(data[11]);
            int propertyCrime = Integer.parseInt(data[12]);
            double propertyCrimeRate = Double.parseDouble(data[13]);
            int burglary = Integer.parseInt(data[14]);
            double burglaryRate = Double.parseDouble(data[15]);
            int larcenyTheft = Integer.parseInt(data[16]);
            double larcenyTheftRate = Double.parseDouble(data[17]);
            int motorVehicleTheft = Integer.parseInt(data[18]);
            double motorVehicleTheftRate = Double.parseDouble(data[19]);
            CrimeStat cs = new CrimeStat(year, population, violentCrime, violentCrimeRate, murderNnManslaughter,
                    murderNnManslaughterRate, rape, rapeRate, robbery, robberyRate, aggAssault, aggAssaultRate,
                    propertyCrime, propertyCrimeRate, burglary, burglaryRate, larcenyTheft, larcenyTheftRate,
                    motorVehicleTheft, motorVehicleTheftRate);
            crimeDB.put(year, cs);

        }
    }

    // computes the population growth for each subsequent year and adds it to a array
    // iterates over the array and prints all values
    private void getPopulationGrowth() {
        Double[] popGrowth = new Double[csvRows.size() - 1];
        Double growthRate;
        List keys = new ArrayList(crimeDB.keySet());
        CrimeStat prev = crimeDB.get(keys.get(0));
        for (int i = 1; i < keys.size(); i++) {
            CrimeStat next = crimeDB.get(keys.get(i));
            growthRate = (double) (next.getPopulation() - prev.getPopulation()) / prev.getPopulation();
            popGrowth[i - 1] = growthRate * 100;
            prev = next;
        }
        System.out.println("The population growth from 1994 - 2013: ");
        for (Double d : popGrowth) {
            System.out.printf("%.2f\n", d);
        }
        System.out.println();
    }

    // iterates over each CrimeStat object's values and finds the lowest Murder rate
    // returns a String object with the lowest murder rate to caller
    private String getMinMurderRate() {
        List keys = new ArrayList(crimeDB.keySet());
        int lowYear = crimeDB.get(keys.get(0)).getYear();
        Double lowRate = crimeDB.get(keys.get(0)).getMurderNnManslaughterRate();
        for (int i = 1; i < crimeDB.size(); i++) {
            Double nextRate = crimeDB.get(keys.get(i)).getMurderNnManslaughterRate();
            if (nextRate < lowRate) {
                lowRate = nextRate;
                lowYear = crimeDB.get(keys.get(i)).getYear();
            }
        }
        String str = "The Murder rate was the lowest in %d\n\n";
        return String.format(str, lowYear);
    }

    // iterates over each CrimeStat object's values and finds the highest Murder rate
    // returns a String object with the highest murder rate to caller
    private String getMaxMurderRate() {
        List keys = new ArrayList(crimeDB.keySet());
        int highYear = crimeDB.get(keys.get(0)).getYear();
        Double highRate = crimeDB.get(keys.get(0)).getMurderNnManslaughterRate();
        for (int i = 1; i < crimeDB.size(); i++) {
            Double nextRate = crimeDB.get(keys.get(i)).getMurderNnManslaughterRate();
            if (nextRate > highRate) {
                highRate = nextRate;
                highYear = crimeDB.get(keys.get(i)).getYear();
            }
        }
        String str = "The Murder rate was the highest in %d\n\n";
        return String.format(str, highYear);
    }

    // iterates over each CrimeStat object's values and finds the lowest Robbery rate
    // returns a String object with the lowest Robbery rate to caller
    private String getMinRobberyRate() {
        List keys = new ArrayList(crimeDB.keySet());
        int lowYear = crimeDB.get(keys.get(0)).getYear();
        Double lowRate = crimeDB.get(keys.get(0)).getRobberyRate();
        for (int i = 1; i < crimeDB.size(); i++) {
            Double nextRate = crimeDB.get(keys.get(i)).getRobberyRate();
            if (nextRate < lowRate) {
                lowRate = nextRate;
                lowYear = crimeDB.get(keys.get(i)).getYear();
            }
        }
        String str = "The Robbery rate was the lowest in %d\n\n";
        return String.format(str, lowYear);
    }

    // iterates over each CrimeStat object's values and finds the highest Robbery rate
    // returns a String object with the highest Robbery rate to caller
    private String getMaxRobberyRate() {
        List keys = new ArrayList(crimeDB.keySet());
        int highYear = crimeDB.get(keys.get(0)).getYear();
        Double highRate = crimeDB.get(keys.get(0)).getRobberyRate();
        for (int i = 1; i < crimeDB.size(); i++) {
            Double nextRate = crimeDB.get(keys.get(i)).getRobberyRate();
            if (nextRate > highRate) {
                highRate = nextRate;
                highYear = crimeDB.get(keys.get(i)).getYear();
            }
        }
        String str = "The Robbery rate was the highest in %d\n\n";
        return String.format(str, highYear);
    }

    private String getMaxPropertyRate() {
        List keys = new ArrayList(crimeDB.keySet());
        int highYear = crimeDB.get(keys.get(0)).getYear();
        Double highRate = crimeDB.get(keys.get(0)).getPropertyCrimeRate();
        for (int i = 1; i < crimeDB.size(); i++) {
            Double nextRate = crimeDB.get(keys.get(i)).getPropertyCrimeRate();
            if (nextRate > highRate) {
                highRate = nextRate;
                highYear = crimeDB.get(keys.get(i)).getYear();
            }
        }
        String str = "The Robbery rate was the highest in %d with a rate of %.1f\n\n";
        return String.format(str, highYear, highRate);
    }

    // prints menu and continues to prompt user for input
    public void printMenu() {
        boolean prompt = true;
        System.out.println("********** Welcome to the US Crime Statistical Application **************************\n");
        while (prompt) {
            String str = "Enter the number of the question you want answered. Enter ‘Q’ to quit the program :\n\n" +
                    "1. What were the percentages in population growth for each consecutive year from 1994 – 2013?\n" +
                    "2. What year was the Murder rate the highest?\n" +
                    "3. What year was the Murder rate the lowest?\n" +
                    "4. What year was the Robbery rate the highest?\n" +
                    "5. What year was the Robbery rate the lowest?\n" +
                    "6. What is the highest Property crime year and rate?\n" +
                    "Q. Quit the program\n\n" +
                    "Enter your selection: ";

            System.out.print(str);
            answer = scIn.next();
            System.out.println();

            if(answer.charAt(0) == 'Q' || answer.charAt(0) == 'q'){
                System.out.println("Thank you for trying the US Crimes Statistics Program.\n");
                prompt = false;
                break;
            } else if (!answer.equals(Integer.toString(1)) && !answer.equals(Integer.toString(2)) &&
                    !answer.equals(Integer.toString(3)) && !answer.equals(Integer.toString(4)) &&
                    !answer.equals(Integer.toString(5)) && !answer.equals(Integer.toString(6)) &&
                    !answer.equals('Q'))
            {
                System.out.println("You must enter a choice between 1-6 or Q");
            } else if (answer.equals(Integer.toString(1))) {
                getPopulationGrowth();
            } else if(answer.equals(Integer.toString(2))) {
                System.out.println(getMaxMurderRate());
            } else if(answer.equals(Integer.toString(3))) {
                System.out.println(getMinRobberyRate());
            } else if(answer.equals(Integer.toString(4))) {
                System.out.println(getMaxRobberyRate());
            } else if(answer.equals(Integer.toString(5))) {
                System.out.println(getMinRobberyRate());
            } else {
                System.out.println(getMaxPropertyRate());
            }
        }
    }
}