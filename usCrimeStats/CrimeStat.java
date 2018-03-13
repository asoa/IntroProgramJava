/*
 * File: CrimeStat.java
 * Author: Alex Bailey
 * Date: 2 MAR 18
 * Purpose: CrimeStat object has attributes from the columns of Crime.csv
 */

public class CrimeStat {
    // CrimeState attributes
    private int year;
    private int population;
    private int violentCrime;
    private double violentCrimeRate;
    private int murderNnManslaughter;
    private double murderNnManslaughterRate;
    private int rape;
    private double rapeRate;
    private int robbery;
    private double robberyRate;
    private int aggAssault;
    private double aggAssaultRate;
    private int propertyCrime;
    private double propertyCrimeRate;
    private int burglary;
    private double burglaryRate;
    private int larcenyTheft;
    private double larcenyTheftRate;
    private int motorVehicleTheft;
    private double motorVehicleTheftRate;
    // theftRate;

    // constructor
    public CrimeStat(int year, int population, int violentCrime, double violentCrimeRate, int murderNnManslaughter,
                     double murderNnManslaughterRate, int rape, double rapeRate, int robbery, double robberyRate,
                     int aggAssault, double aggAssaultRate, int propertyCrime, double propertyCrimeRate, int burglary,
                     double burglaryRate, int larcenyTheft, double larcenyTheftRate, int motorVehicleTheft,
                     double motorVehicleTheftRate)
    {
        this.year = year;
        this.population = population;
        this.violentCrime = violentCrime;
        this.violentCrimeRate = violentCrimeRate;
        this.murderNnManslaughter = murderNnManslaughter;
        this.murderNnManslaughterRate = murderNnManslaughterRate;
        this.rape = rape;
        this.rapeRate = rapeRate;
        this.robbery = robbery;
        this.robberyRate = robberyRate;
        this.aggAssault = aggAssault;
        this.aggAssaultRate = aggAssaultRate;
        this.propertyCrime = propertyCrime;
        this.propertyCrimeRate = propertyCrimeRate;
        this.burglary = burglary;
        this.burglaryRate = burglaryRate;
        this.larcenyTheft = larcenyTheft;
        this.larcenyTheftRate = larcenyTheftRate;
        this.motorVehicleTheft = motorVehicleTheft;
        this.motorVehicleTheftRate = motorVehicleTheftRate;
    }

    // getters and setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getViolentCrime() {
        return violentCrime;
    }

    public void setViolentCrime(int violentCrime) {
        this.violentCrime = violentCrime;
    }

    public double getViolentCrimeRate() {
        return violentCrimeRate;
    }

    public void setViolentCrimeRate(double violentCrimeRate) {
        this.violentCrimeRate = violentCrimeRate;
    }

    public int getMurderNnManslaughter() {
        return murderNnManslaughter;
    }

    public void setMurderNnManslaughter(int murderNnManslaughter) {
        this.murderNnManslaughter = murderNnManslaughter;
    }

    public double getMurderNnManslaughterRate() {
        return murderNnManslaughterRate;
    }

    public void setMurderNnManslaughterRate(int murderNnManslaughterRate) {
        this.murderNnManslaughterRate = murderNnManslaughterRate;
    }

    public int getRape() {
        return rape;
    }

    public void setRape(int rape) {
        this.rape = rape;
    }

    public double getRapeRate() {
        return rapeRate;
    }

    public void setRapeRate(double rapeRate) {
        this.rapeRate = rapeRate;
    }

    public int getRobbery() {
        return robbery;
    }

    public void setRobbery(int robbery) {
        this.robbery = robbery;
    }

    public double getRobberyRate() {
        return robberyRate;
    }

    public void setRobberyRate(double robberyRate) {
        this.robberyRate = robberyRate;
    }

    public int getAggAssault() {
        return aggAssault;
    }

    public void setAggAssault(int aggAssault) {
        this.aggAssault = aggAssault;
    }

    public double getAggAssaultRate() {
        return aggAssaultRate;
    }

    public void setAggAssaultRate(double aggAssaultRate) {
        this.aggAssaultRate = aggAssaultRate;
    }

    public int getPropertyCrime() {
        return propertyCrime;
    }

    public void setPropertyCrime(int propertyCrime) {
        this.propertyCrime = propertyCrime;
    }

    public double getPropertyCrimeRate() {
        return propertyCrimeRate;
    }

    public void setPropertyCrimeRate(double propertyCrimeRate) {
        this.propertyCrimeRate = propertyCrimeRate;
    }

    public int getBurglary() {
        return burglary;
    }

    public void setBurglary(int burglary) {
        this.burglary = burglary;
    }

    public double getBurglaryRate() {
        return burglaryRate;
    }

    public void setBurglaryRate(double burglaryRate) {
        this.burglaryRate = burglaryRate;
    }

    public int getLarcenyTheft() {
        return larcenyTheft;
    }

    public void setLarcenyTheft(int larcenyTheft) {
        this.larcenyTheft = larcenyTheft;
    }

    public double getLarcenyTheftRate() {
        return larcenyTheftRate;
    }

    public void setLarcenyTheftRate(double larcenyTheftRate) {
        this.larcenyTheftRate = larcenyTheftRate;
    }

    public int getMotorVehicleTheft() {
        return motorVehicleTheft;
    }

    public void setMotorVehicleTheft(int motorVehicleTheft) {
        this.motorVehicleTheft = motorVehicleTheft;
    }

    public double getMotorVehicleTheftRate() {
        return motorVehicleTheftRate;
    }

    public void setMotorVehicleTheftRate(double motorVehicleTheftRate) {
        this.motorVehicleTheftRate = motorVehicleTheftRate;
    }
}
