package ClinicHeartSystem;

import java.util.ArrayList;

public class Patient {
    // Fields
    private String name;  // Name of the patient
    private int age;      // Age of the patient
    private String workplace;  // Workplace of the patient
    private String city;       // City where the patient lives
    private ArrayList<BloodPressure> bloodPressureRecords;  // List of blood pressure records
    private ArrayList<HeartRate> heartRateRecords;          // List of heart rate records
    private ArrayList<Medication> medications;              // List of medications prescribed
    private ArrayList<Advice> advices;                      // List of advices given to the patient

    // Constructor
    public Patient(String name, int age, String workplace, String city) { 
        this.name = name;
        this.age = age;
        this.workplace = workplace;
        this.city = city;
        bloodPressureRecords = new ArrayList<>();  // Initialize blood pressure records list
        heartRateRecords = new ArrayList<>();     // Initialize heart rate records list
        medications = new ArrayList<>();          // Initialize medications list
        advices = new ArrayList<>();              // Initialize advices list
    }
    
    // Getters
    public String getPatientINFO() {
        return "Name: " + name + " , Age: " + age + " , Workplace: " + workplace + " , City: " + city;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getWorkplace() {
        return workplace;
    }

    public ArrayList<Medication> getMedications() {
        return medications;
    }

    public ArrayList<BloodPressure> getBpRecords() {
        return bloodPressureRecords;
    }

    public ArrayList<HeartRate> getHrRecords() {
        return heartRateRecords;
    }

    public ArrayList<Advice> getAdvices() {
        return advices;
    }

    // Setters
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to check if the patient is at risk based on blood pressure and heart rate
    public boolean isAtRisk() {
        // Check Blood Pressure Risk
        for (BloodPressure bp : bloodPressureRecords) {
            if (!bp.getRiskLevel().equals("Normal")) {
                return true;  // Patient is at risk if any blood pressure is not normal
            }
        }

        // Check Heart Rate Risk
        for (HeartRate hr : heartRateRecords) {
            if (!hr.getRiskLevel().equals("Normal")) {
                return true;  // Patient is at risk if any heart rate is not normal
            }
        }

        return false; // No risks found
    }

    // Methods to add records for blood pressure, heart rate, medications, and advices
    public void addBloodPressureRecord(BloodPressure bp) {
        bloodPressureRecords.add(bp);
    }

    public void addHeartRateRecord(HeartRate hr) {
        heartRateRecords.add(hr);
    }

    public void addAdvice(Advice advice) {
        advices.add(advice);
    }

    public void addMedication(Medication medication) {
        medications.add(medication);
    }

    // Override toString method to return patient info
    @Override
    public String toString() {
        return getPatientINFO();  // This will return the string with patient's details
    }
}
