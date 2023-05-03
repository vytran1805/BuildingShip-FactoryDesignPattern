package ShipFactoryPackage;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;

/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 22S_CST8288_012
* Description: This ShipFactory interface includes methods to add some parts of the ship (Weapon and Engine), and is implemented by other 2 subclasses
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/

/**
 * This interface defines the basic behaviors of the factory such as addGun(), addEngine()
 * @author Rama
 */
// Here is where the require equipments are defined

public interface ShipFactory{
	/**
         * Method to add Weapon
         * @return weapon type object
         */
	public Weapon addGun();
        /**
         * Method to add Engine
         * @return engine type object
         */
	public Engine addEngine();
	
}

