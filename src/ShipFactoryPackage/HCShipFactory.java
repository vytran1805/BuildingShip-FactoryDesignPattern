/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 22S_CST8288_012
* Description: This factory uses the ShipFactory interface to create specific Surface HC Ship
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/
package ShipFactoryPackage;
import ShipEquipments.HCEngine;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;
import ShipEquipments.HCGun;

/**
 * This factory implements the ShipFactory interface and provides implementation to make HCShip equipments
 * @author Rama
 */
// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being Weapon and Engine

// The returned object specifies a specific weapon & engine
public class HCShipFactory implements ShipFactory{
    /**
     * Weapon type attribute
     */
    Weapon weapon;
    /**
     * Engine type attribute
     */
    Engine engine;
	/**
         * Add weapon to the HCShip by creating a new HCGun() object
         * @return HCGun() object
         */
	// Defines the weapon object to associate with the ship
	@Override
	public Weapon addGun() {
		weapon = new HCGun();
            return weapon;
	}
	/**
         * Create new HCEngine() object
         * @return HCEngine() object
         */
	// Defines the engine object to associate with the ship
	@Override
	public Engine addEngine() {
		engine = new HCEngine();
                return engine;
	}
}