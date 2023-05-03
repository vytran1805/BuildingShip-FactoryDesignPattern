/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 22S_CST8288_012
* Description: This factory uses the ShipFactory interface to create very specific Surface CSC Ship
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/
package ShipFactoryPackage;
import ShipEquipments.CSCGun;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;
import ShipEquipments.CSCEngine;

/**
 * This factory implements the ShipFactory interface and provides implementation to make HCShip equipments
 * @author Rama
 */
// This factory uses the ShipFactory interface
// to create very specific Surface Ship (here a CSC Ship)

// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being Weapon and Engine

// The returned object specifies a specific weapon & engine
public class CSCShipFactory implements ShipFactory{
    /**
     * Weapon type attribute
     */
    Weapon weapon;
    /**
     * Engine type attribute
     */
    Engine engine;

	// Defines the weapon object to associate with the ship
	/**
         * Add weapon to the HCShip by creating a new HCGun() object
         * @return CSCGun() object
         */
        @Override
	public Weapon addGun() {
		weapon = new CSCGun();
                return new CSCGun();
	}

	// Defines the engine object to associate with the ship
	/**
         * Create new CSCEngine() object
         * @return CSCEngine() object
         */
        @Override
	public Engine addEngine() {
		engine = new CSCEngine();
                return new CSCEngine();
	}

}

