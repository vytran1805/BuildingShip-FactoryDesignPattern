/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 22S_CST8288_012
* Description: This class includes the method that decides which Canadian ship to create.
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/
package ShipBuildPackage;
import ShipFactoryPackage.CSCShipFactory;
import ShipFactoryPackage.HCShipFactory;
import ShipPackage.Ship;
import ShipPackage.HCShip;
import ShipPackage.CSCShip;
import ShipFactoryPackage.ShipFactory;

/**
 * This class implements the ShipBuilding abstract class
 * @author Rama
 */
// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build

public class SurfaceShipBuilding extends ShipBuilding {
        /**
         * This method determines which Canadian ship to create by taking typeOfShip parameter
         * @param typeOfShip type of the ship
         * @return Canadian Ship
         */
        @Override
	protected Ship makeCanadianShip(String typeOfShip) {
		Ship theCanadianShip = null;
		if(typeOfShip.equals("HC")){
                        //3. The class then go to the ShipFactory to create a Factory that can build the HC (here HCShipFactory)
			ShipFactory shipPartsFactory = new HCShipFactory();
                        //4. Then create the actual surface HC ship from the factory
			theCanadianShip = new HCShip(shipPartsFactory);
			theCanadianShip.setName("HMCS Ottawa");	
                        System.out.println("Created Halifax Class ship " + theCanadianShip.getName()); 
		} else 
			
		if(typeOfShip.equals("CSC")){
			ShipFactory shipPartsFactory = new CSCShipFactory();
			theCanadianShip = new CSCShip(shipPartsFactory);
			theCanadianShip.setName("HMCS CSC001");
                        System.out.println("Created Canadian Surface Combatant ship " + theCanadianShip.getName());
			
		} 	
	return theCanadianShip; //return the Ship type object(here HCShip object)
	}
}

