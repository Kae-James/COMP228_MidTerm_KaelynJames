// This program represents a person
// This class is the highest parent class
package com.kj.midterm;

// Create Person class
public abstract class Person {
    // Variables
	private final String personId;
    private String name;
    private String phoneNumber;
    protected static int personCount = 0;

    // Constructor to initialize variables
    public Person(String personId, String name, String phoneNumber) {
        if (personId == null || name == null) throw new IllegalArgumentException("Fields cannot be null");
        this.personId = personId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        personCount++;
    }

    // Validation helper 1 (for empty values)
    protected static String requireText(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " is required");
        }
        return value;
    }
 
    // Validation helper 2 (for negative numbers)
    protected static double requireNonNegative(double value, String fieldName) {
        if (value < 0) {
            throw new IllegalArgumentException(fieldName + " cannot be negative");
        }
        return value;
    }
 
    // Method 1 (static, returns number of registered people)
    public static int getPersonCount() { return personCount; }
    public String getName() { return name; }
    
    // Method 2 (concrete, displays basic details)
    public void displayBasicDetails() {
        System.out.println("ID: " + personId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
    }

    // Method 3 (abstract)
    public abstract String getRoleDescription();

    // Method 4 (override toString, returns description of person)
    @Override
    public String toString() {
        return "Person [ID=" + personId + ", Name=" + name + ", Role=" + getRoleDescription() + "]";
    }
}