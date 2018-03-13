/*
 * File: HeadPhoneTest.java
 * Author: Alex Bailey
 * Date: 18 FEB 18
 * Purpose: Test code for HeadPhone class.  Creates 3 HeadPhone objects, changes the volume,
 * and then prints out the objects attributes.
 */

public class HeadPhoneTest {
    public static void main(String[] args) {
        // create headphone objects
        HeadPhone headphone1 = new HeadPhone();
        HeadPhone headphone2 = new HeadPhone("Samsung","Red", "Gear IconX");
        HeadPhone headPhone3 = new HeadPhone("Yellow");

        // change the volume
        headphone1.changeVolume(1);
        headphone2.changeVolume(3);
        headPhone3.changeVolume(3);

        // print the objects' attributes
        System.out.println(headphone1.toString());
        System.out.println(headphone2.toString());
        System.out.println(headPhone3.toString());

    }
}
