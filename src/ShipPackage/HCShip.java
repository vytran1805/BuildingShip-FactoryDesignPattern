/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 23S_CST8288_012
* Description: This factory creates specific Surface HC Ship
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/
package ShipPackage;

import ShipEquipments.Weapon;
import ShipFactoryPackage.HCShipFactory;
import ShipFactoryPackage.ShipFactory;

/**
 * This class is the HCShip concrete product class that extends the abstract class Ship 
 * @author Rama
 */
public class HCShip extends Ship{
	
	/**
         * ShipFactory type reference 
         */
	ShipFactory shipFactory;
        
        
	/**
         * HCShip constructor with ShipFactory type parameter
         * @param shipFactory ShipFactory type reference
         */
	public HCShip(ShipFactory shipFactory){
                this.shipFactory = shipFactory;
	}

	// EnemyShipBuilding calls this method to build a 
	// specific HCShip
	/**
         * This method calls addEngine() and addGun() to actually add equipments to the ship and printout the name of the ship
         */
	public void equipShip() {   //6. Call addEngine() and addGun() methods of the HCShipFactory to populate weapon and engine
		super.engine = shipFactory.addEngine(); //this will call the toString() of HCEngine() class and assign to the engine attribute of the super class (Ship)
                super.weapon = shipFactory.addGun();    //this will call the toString() of HCWeapon() class
		System.out.println("Adding equipments to Halifax Class ship " + getName());
		// Insert code to populate weapon and engine with suitable ones
                   
	}
}