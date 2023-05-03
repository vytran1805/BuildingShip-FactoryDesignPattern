/**
* Assessment: Implementing the abstract factory pattern
* Assignment: Assignment 1
* Student Name: Vy Tran
* Due Date: March 10, 2023
* Course & Section #: 22S_CST8288_012
* Description: This class includes method to displays CSC engine specification
* Professor Name: Professor Rama Thavasinadar
* This lab has been completed for demo by: Vy Tran 
* Declaration: This is my own original work and is free from Plagiarism.
*/
package ShipEquipments;

/**
 * This class implements engine interface
 * @author Rama
 */
public class CSCEngine implements Engine{
    /**
     * Method provides CES engine specification
     * @return CSC Engine specification
     */
    @Override
    public String toString(){
        String CSCEngine = "Expected Maximum speed of 27 Knots (50 Km/hour)";
        return CSCEngine;
    }
}
