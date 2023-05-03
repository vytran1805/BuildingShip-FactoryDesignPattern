/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 22S_CST8288_012
* Description: This class includes method to display Weapon specification
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/ 
package ShipEquipments;

/**
 * This interface is implemented by CSCWeapon and HCWeapon within the ShipEquipments package
 * @author Rama
 */
// Any part that implements the interface Weapon
// can replace that part in any ship
public interface Weapon{
        /**
         * Method to display Weapon specification, it is implemented by its 2 subclasses
         * @return String
         */
	public String toString();

}
