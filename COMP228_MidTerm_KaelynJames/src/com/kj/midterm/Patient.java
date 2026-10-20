// This program represents a patient
// This class is a child of Person, showing single level inheritance
package com.kj.midterm;

// Create Patient class (extends Person)
public class Patient extends Person {
    // Variables
	private final String patientNumber;
    private int age;
    private String medicalDepartment;
    private double consultationFee;
    protected static int patientCount = 0;

    // Constructor to initialize variables
    public Patient(String id, String name, String phone, String patientNumber, int age, String dept, double fee) {
        super(id, name, phone);
        if (age < 0 || age > 120) reject("Invalid age");
        if (dept == null || dept.trim().isEmpty()) reject("Department is required");
        if (fee < 0) reject("Consultation fee cannot be negative");
        this.patientNumber = patientNumber;
        this.age = age;
        this.medicalDepartment = dept;
        this.consultationFee = fee;
        patientCount++;
    }
    private static void reject(String message) {
        personCount--;
        throw new IllegalArgumentException(message);
    }
    
    // Counts patients
    public static int getPatientCount() { return patientCount; }

    // Method 1 (overrides method from Person)
    @Override
    public String getRoleDescription() { return "Patient"; }

    // Method 2 (displays Patient information)
    public void displayPatientDetails() {
        System.out.println("\nPATIENT REGISTRATION");
        System.out.println("Patient Number: " + patientNumber);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + age);
        System.out.println("Department: " + medicalDepartment);
        System.out.println("Registration Status: Successful");
    }

    // Method 3 (Patient registration)
    public void registerPatient(String name, int age) {
        System.out.println("Registered " + name + ", Age: " + age);
    }

    public void registerPatient(String name, int age, String medicalDepartment) {
        System.out.println("Registered " + name + ", Age: " + age + ", Department: " + medicalDepartment);
    }
}