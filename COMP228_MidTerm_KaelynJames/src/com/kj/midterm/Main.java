// This program runs the hospital management system
package com.kj.midterm;

// Create Main class
public class Main {
    // Print title
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("          CAREPOINT HOSPITAL            ");
        System.out.println("          MANAGEMENT SYSTEM             ");
        System.out.println("========================================");

        // Patient 1
        Patient patient1 = new Patient("PID001", "Kaelyn James", "226-225-3555", "P1001", 19, "General Medicine", 150.0);
        patient1.displayPatientDetails();
        patient1.registerPatient("Kaelyn James", 19);
        
        // Patient 2
        Patient patient2 = new Patient("PID002", "Jenna Oswald", "416-364-1202", "P1002", 35, "Cardiology", 120.0);
        patient2.displayPatientDetails();
        patient2.registerPatient("Jenna Oswald", 35, "Cardiology");
        
        // Patient 3
        Patient patient3 = new Patient("PID003", "Brad Penn", "519-754-8675", "P1003", 24, "ICU", 30.0);
        patient3.displayPatientDetails();
        patient3.registerPatient("Brad Penn", 24);
        
        // Patient 4 (invalid test patient)
        try {
            new Patient("PID004", "Test Patient", "555-000-0000", "P1004", 200, "ICU", 50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nRegistration failed: " + e.getMessage());
        }

        // Create Medical Staff 
        Doctor doctor1 = new Doctor("SID001", "Dr. Keyanna Marley", "226-555-7203", "D2001", "Cardiology", 9000.0, 150.0, 100);
        SpecialistDoctor specialist1 = new SpecialistDoctor("SID002", "Dr. Krystopher Shane", "519-555-3704", "D2002", "Neurology", 12000.0, 150.0, 80, "Neurology", 50.0);
        Nurse nurse1 = new Nurse("SID003", "Sara Stanley", "416-676-0983", "N3001", "Emergency", 4500.0, "Night", 1000.0);

        // Method Overloading for Consultation Fees
        System.out.println("\nCONSULTATION FEE CALCULATIONS");
        System.out.printf("Standard Consultation Fee: $%.2f%n", doctor1.calculateConsultationFee());
        System.out.printf("Consultation Fee After 10%% Discount: $%.2f%n", doctor1.calculateConsultationFee(10.0));
        System.out.printf("Consultation Fee With 10%% Discount & $40 Lab Charge: $%.2f%n", doctor1.calculateConsultationFee(10.0, 40.0));
        System.out.printf("Consultation Fee With Additional Charge: $%.2f%n", specialist1.calculateConsultationFee());

        // Demonstrate interfaces (reportable and schedulable)
        System.out.println("\nINTERFACE DEMONSTRATIONS");
        specialist1.generateReport();
        specialist1.scheduleAppointment("2026-10-25 10:30 AM");

        // Demonstrate runtime polymorphism using superclass references
        System.out.println("\nRUNTIME POLYMORPHISM");
        MedicalStaff staff1 = doctor1;
        MedicalStaff staff2 = specialist1;
        MedicalStaff staff3 = nurse1;

        staff1.displayStaffDetails();
        staff2.displayStaffDetails();
        staff3.displayStaffDetails();

        // Print registration summary
        System.out.println("\nREGISTRATION SUMMARY");
        System.out.println("Total People: " + Person.getPersonCount());
        System.out.println("Total Patients: " + Patient.getPatientCount());
        System.out.println("Total Medical Staff: " + MedicalStaff.getStaffCount());
        System.out.println("\n========================================");
        System.out.println("            END OF REPORT               ");
        System.out.println("========================================");
    }
}