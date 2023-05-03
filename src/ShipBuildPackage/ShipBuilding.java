/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 22S_CST8288_012
* Description: This abstract class provides abstract method to create every new ship instance
*               It's an abstract class because it makes a specific vehicle for its particular factory
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/
package ShipBuildPackage;
import ShipPackage.Ship;

/**
 * This abstract class provides abstract method to order Canadian ship instance,
 * is implemented by SurfaceShipBuilding class
 * @author Rama
 */
public abstract class ShipBuilding {	
        /**
         * Abstract method to create surface of a Canadian ship
         * @param typeOfShip type of ship to create
         * @return Ship type object
         */
	protected abstract Ship makeCanadianShip(String typeOfShip);
        /**
         * This method calls method to actually build the ship
         * @param typeOfShip type of the ship
         * @return the Ship
         */
	public Ship orderTheShip(String typeOfShip) {
                //2. Call the method to make a ship
		Ship theShip = makeCanadianShip(typeOfShip);
                //5. Call the equipShip() method of the ship that is just created (here HC ship)
		theShip.equipShip();
                //7.Finally return the Ship type object
		return theShip;
		
	}
}

