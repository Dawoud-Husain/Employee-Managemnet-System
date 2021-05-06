/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dawoud
 */
// FULL TIME EMPLOYEE
public class FTE extends EmployeeInfo {

    /**
     *
     */
    public double yearlySalary;

    /**
     *
     * @param eN
     * @param fN
     * @param lN
     * @param s
     * @param wL
     * @param dR
     * @param yS
     */
    public FTE(int eN, String fN, String lN, int g, int wL, double dR, double yS) {
        super(eN, fN, lN, g, wL, dR);
        yearlySalary = yS;

    }

    //Yearly Salary Getter
    public double getyS() {
        return yearlySalary;
    }

}
