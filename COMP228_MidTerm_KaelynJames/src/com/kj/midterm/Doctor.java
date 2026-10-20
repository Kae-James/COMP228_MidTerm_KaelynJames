// This program represents a doctor
// This class is a child of MedicalStaff, showing inheritance
package com.kj.midterm;

// Create Doctor class (extends MedicalStaff)
public class Doctor extends MedicalStaff {
    // Variables
	private final double consultationFee;
    private int patientsSeen;

    // Constructor to initialize variables
    public Doctor(String id, String name, String phone, String staffId, String dept, double salary, double fee, int patients) {
        super(id, name, phone, staffId, dept, salary);
        this.consultationFee = fee;
        this.patientsSeen = patients;
    }

    // Gets role
    @Override
    public String getRoleDescription() { return "Doctor"; }

    // Method 1 (returns doctor's monthly salary plus performance allowance)
    @Override
    public double calculateMonthlyCompensation() {
        return getMonthlySalary() + (patientsSeen * 10.0);
    }

    // Method 2 (displays doctor's information)
    @Override
    public void displayStaffDetails() {
        System.out.println("\nDOCTOR DETAILS");
        super.displayStaffDetails();
        System.out.printf("Monthly Salary: $%.2f%n", getMonthlySalary());
        System.out.println("Patients Seen: " + patientsSeen);
        System.out.println("Consultation Fee: $" + consultationFee);
        System.out.println("Monthly Compensation: $" + calculateMonthlyCompensation());
    }

    // Method 3 (overloaded method)
    public double calculateConsultationFee() { return consultationFee; }
    public double calculateConsultationFee(double discount) { return consultationFee * (1 - discount / 100); }
    public double calculateConsultationFee(double discount, double extra) { return calculateConsultationFee(discount) + extra; }
}