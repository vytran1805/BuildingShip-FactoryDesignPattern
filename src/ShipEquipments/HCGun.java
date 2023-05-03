/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 22S_CST8288_012
* Description: This class includes method to display HC Weapon specification
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/
package ShipEquipments;

/**
 * This class implements Weapon interface
 * @author Rama
 */
public class HCGun implements Weapon{
    /**
     * Method provides HC Gun specification
     * @return HCEngine specification
     */
    @Override
    public String toString(){
        return "57mm/70 caliber gun from Bofors";
    }
        
}
