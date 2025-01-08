package ClinicHeartSystem;

import java.util.ArrayList;
import java.util.Iterator;

public class Clinic {
    // Fields
    private String name;                      // Name of the clinic
    private ArrayList<Patient> patients;      // List of patients in the clinic
    private ArrayList<String> cardiologists;  // List of cardiologists assigned to patients

    // Constructor
    public Clinic(String name) {
        this.name = name;                    // Initialize the clinic's name
        patients = new ArrayList<>();    // Initialize the list of patients
        cardiologists = new ArrayList<>(); // Initialize the list of cardiologists
    }

    // Methods

    // Adds a patient to the clinic
    public void addPatient(Patient patient) {
        patients.add(patient);                // Add the given patient to the list of patients
    }

    // Assigns a cardiologist to a patient
    public void assignCardiologist(Patient patient, String cardiologist) {
        // Check if the patient is registered in the clinic
        if (!patients.contains(patient)) {
            System.out.println("Patient not registered in the clinic.");
            return;  // Exit if patient is not registered
        }
        cardiologists.add(cardiologist);      // Add the cardiologist to the list of assigned cardiologists
        System.out.println("Cardiologist assigned to patient " + patient.getPatientINFO());
    }

    // Displays the clinic's information
    public void displayClinicInfo() {
        System.out.println("Clinic: " + name);  // Display the clinic's name
        System.out.println("Patients in Clinic:");
        // Check if there are any patients in the clinic
        if (patients.isEmpty()) {
            System.out.println("No patients available."); // Display a message if no patients exist
        } else {
            // Use an iterator to go through the list of patients
            Iterator<Patient> iterator = patients.iterator();  
            while (iterator.hasNext()) {
                Patient p = iterator.next();  // Get the next patient in the list
                System.out.println(p);  // Print the patient's information (calls the overridden toString method in Patient)
            }
        }
    }
}
