// This program represents medical staff 
// This class is a child of Person, showing single level inheritance
package com.kj.midterm;

// Create MedicalStaff class (extends Person)
public abstract class MedicalStaff extends Person {
    // Variables
	private final String staffId;
    private String department;
    private double monthlySalary;
    private static int staffCount = 0;

    // Constructor to initialize variables
    public MedicalStaff(String id, String name, String phone, String staffId, String dept, double salary) {
        super(id, name, phone);
        if (salary < 0) throw new IllegalArgumentException("Salary cannot be negative");
        this.staffId = staffId;
        this.department = dept;
        this.monthlySalary = salary;
        staffCount++;
    }

    // Getters
    public static int getStaffCount() { return staffCount; }
    public String getStaffId() { return staffId; }
    public String getDepartment() { return department;}
    public double getMonthlySalary() { return monthlySalary; }

    // Method 1 (abstract)
    public abstract double calculateMonthlyCompensation();

    // Method 2 (concrete)
    public void displayStaffDetails() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + getName());
        System.out.println("Department: " + department);
    }
}