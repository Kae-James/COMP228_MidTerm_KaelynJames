// This program represents a nurse
// This class is a child of MedicalStaff, showing hierarchical level inheritance
package com.kj.midterm;

//Create Nurse class (extends MedicalStaff)
public class Nurse extends MedicalStaff {
    // Variables
	private final String shiftType;
    private final double shiftAllowance;

    // Constructor to initialize variables
    public Nurse(String id, String name, String phone, String staffId, String dept, double salary, String shift, double allowance) {
        super(id, name, phone, staffId, dept, salary);
        this.shiftType = shift;
        this.shiftAllowance = allowance;
    }

    // Gets role
    @Override
    public String getRoleDescription() { return "Nurse"; }

    // Method 1 (calculates monthly salary with shift allowance)
    @Override
    public double calculateMonthlyCompensation() {
        return getMonthlySalary() + shiftAllowance;
    }

    // Method 2 (overrides method)
    @Override
    public void displayStaffDetails() {
        System.out.println("\nNURSE DETAILS");
        super.displayStaffDetails();
        System.out.println("Shift: " + shiftType);
        System.out.println("Monthly Compensation: $" + calculateMonthlyCompensation());
    }
}