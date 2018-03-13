import java.util.Scanner;

public class AirFryerTest {
    public static void main(String[] args) {
        // vars
        String meat;
        char answer;

        // create AirFryer object
        AirFryer myFryer = new AirFryer();

        // print cooking times
        myFryer.printCookingTimes();

        // ask user what to cook
        Scanner scIn = new Scanner(System.in);
        System.out.println("\nWhat do you want to cook: fish, chicken, or steak?");
        meat = scIn.next();
        System.out.println(meat);

        // turn on and cook the meat
        System.out.println("\nDo you want to turn the fryer on? (Enter Y|y or N|n)");
        answer = scIn.next().charAt(0);

        if((answer == 'Y') || (answer == 'y')) {
            myFryer.isOn = true;
            myFryer.cook(meat);
        }
    }
}
