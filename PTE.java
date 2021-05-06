/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// PART TIME EMPLOYEE
public class PTE extends EmployeeInfo {

    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;

    public PTE(int eN, String fN, String lN, int g, int wL, double dR, double hW, double hPW, double wPY) {
        super(eN, fN, lN, g, wL, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;

    }

    //getter meathods
    public double gethW() {
        return hourlyWage;
    }

    public double gethPW() {
        return hoursPerWeek;
    }

    public double getwPY() {
        return weeksPerYear;
    }
    
    public double getyS() {
        return weeksPerYear;
    }
    

}
