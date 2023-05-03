/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 22S_CST8288_012
* Description: This is the base abstract class of all ship products, newly defined objects that represent weapon & engine
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/
package ShipPackage;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;

/**
 * This is the base abstract class of all Ship products
 * @author Rama
 */
public abstract class Ship {
	/**
         * name of the ship
         */
	private String name;
	
	// Newly defined objects that represent weapon & engine
	// These can be changed easily by assigning new parts 
	// in HCShipFactory or CSCShipFactory
	/**
         * Weapon type attribute
         */
	Weapon weapon;
        /**
         * Engine type attribute
         */
	Engine engine;
	/**
         * get name of the ship
         * @return name 
         */
	public String getName() { return name; }
        /**
         * set name of the ship
         * @param newName name of the ship
         */
	public void setName(String newName) { name = newName; }
        
	/**
         * abstract method to build the ship, is implemented by subclasses
         */
	public abstract void equipShip();
	
	// Because the toString method is defined in engine
	// when it is printed the String defined in toString goes
	// on the screen
	/**
         * Display the Engine information
         */
	public void displayShipSpeed(){ //9. This method is called! In this example, method toString() of class HCEngine() will be displayed
		System.out.println(getName() + " Engine: " + engine);
		
	}
	/**
         * Display the Weapon description
         */
	public void shipGunDesc(){  //11. This method is called!  In this example, method toString() of class HCWeapon() will be displayed
		
		System.out.println(getName() + " Gun: " + weapon);	
	}
	
	// If any Ship object is printed to screen this shows up
	/**
         * Display information of the Ship that is successfully built
         * @return information of the ship 
         */
	public String toString(){   //12. This method is called!
		
		String infoOnShip = "The " + name + " with " + engine + 
				" and has  " + weapon;
		
		return infoOnShip;	
	}
	
}

