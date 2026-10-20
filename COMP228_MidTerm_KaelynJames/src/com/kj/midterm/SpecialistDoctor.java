// This program represents a specialist doctor
// This class is a child of Doctor, showing multilevel inheritance, and hybrid inheritance using interfaces
package com.kj.midterm;

// Create SpecialistDoctor class (extends Doctor and implements interfaces)
public class SpecialistDoctor extends Doctor implements Reportable, Schedulable {
    // Variables
	private final String specialization;
    private final double specialistSurcharge;

    // Constructor to initialize variables
    public SpecialistDoctor(String id, String name, String phone, String staffId, String dept, double salary, double fee, int patients, String spec, double surcharge) {
        super(id, name, phone, staffId, dept, salary, fee, patients);
        this.specialization = spec;
        this.specialistSurcharge = surcharge;
    }

    // Gets role
    @Override
    public String getRoleDescription() { return "Specialist (" + specialization + ")"; }

    // Method 1 (override method)
    @Override
    public double calculateConsultationFee() {
        return super.calculateConsultationFee() + specialistSurcharge;
    }

    // Method 2 (displays specialist doctor details)
    @Override
    public void displayStaffDetails() {
        System.out.println("\nSPECIALIST DOCTOR DETAILS");
        System.out.println("Staff ID: " + getStaffId());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee (with surcharge): $" + calculateConsultationFee());
        System.out.println("Monthly Compensation: $" + calculateMonthlyCompensation());
    }

    // Interface 1 (reportable)
    @Override
    public void generateReport() { System.out.println("Report generated for Specialist " + getName()); }

    // Interface 2 (schedulable)
    @Override
    public void scheduleAppointment(String date) { System.out.println("Appointment scheduled on " + date); }
}