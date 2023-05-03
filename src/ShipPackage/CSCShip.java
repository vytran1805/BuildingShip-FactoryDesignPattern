/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 22S_CST8288_012
* Description: This factory creates specific Surface CSC Ship
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/

package ShipPackage;
import ShipFactoryPackage.ShipFactory;

/**
 * This class is the CSCShip concrete product class that extends the abstract class Ship 
 * @author Rama
 */
public class CSCShip extends Ship{

	/**
         * shipFactory reference
         */
	ShipFactory shipFactory;
	
	/**
         * HCShip constructor with ShipFactory type parameter
         * @param shipFactory ShipFactory type reference
         */
	public CSCShip(ShipFactory shipFactory){
		
		this.shipFactory = shipFactory;
	}
	
	// EnemyShipBuilding calls this method to build a 
	// specific CSCShip
        /**
         * This method calls addEngine() and addGun() to actually populate equipments to the ship and printout the name of the ship
         */
	public void equipShip() {   
		super.engine = shipFactory.addEngine();
                super.weapon = shipFactory.addGun();
		System.out.println("Adding equipments to Canadian Surface Combatant ship " + getName());
		// Insert code to populate weapon and engine with suitable ones
	}

}

