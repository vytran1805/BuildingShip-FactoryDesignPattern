/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 22S_CST8288_012
* Description: This class includes the main method, which calls methods to create ships.
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/
package shipfactroryMain;
import ShipPackage.Ship;
import ShipBuildPackage.ShipBuilding;
import ShipBuildPackage.SurfaceShipBuilding;

/**
 * This is the driver class for this program. This class runs the application with a method main.
 * @author Rama
 */
public class ShipFactroryTest {

    /**
     * This is the entry point for the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
		ShipBuilding MakeHCs = new SurfaceShipBuilding();
                //1. we order HC ship
		Ship theHC = MakeHCs.orderTheShip("HC");
                //8. Print out the Engine desciption, it will call this method in the abstract Ship class because the HCShip doesn't overwrite this method
		theHC.displayShipSpeed();
                //10. Print out the Engine desciption, it will call this method in the abstract Ship class because the HCShip doesn't overwrite this method
		theHC.shipGunDesc();
                //11. toString() of the abstract class Ship() is called
                System.out.println(theHC + "\n");
                
                
		Ship theCSC = MakeHCs.orderTheShip("CSC");
		theCSC.displayShipSpeed();
		theCSC.shipGunDesc();
		System.out.println(theCSC + "\n");

    }
    
}
