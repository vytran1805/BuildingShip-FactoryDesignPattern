/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 22S_CST8288_012
* Description: This class includes method to displays CSC weapon specification
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/
package ShipEquipments;

/**
 *  This class implements Weapon interface
 * @author Rama
 */
public class CSCGun implements Weapon{
    /**
     * Method provides CES weapon specification
     * @return CSC Weapon specification
     */
    @Override
    public String toString(){
        String CSCEngine = "127mm/64 caliber gun from Leonardo (expected)";
        return CSCEngine;
    }
}
