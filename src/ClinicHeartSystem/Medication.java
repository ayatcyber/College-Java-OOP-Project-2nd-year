package ClinicHeartSystem;

import java.util.ArrayList;

public class Medication {
    // Fields
    private String condition;          // The medical condition for which the medication is prescribed
    private ArrayList<String> medications;  // List of medications prescribed for the condition

    // Constructor
    public Medication(String condition) {
        this.condition = condition;    // Initialize the condition
        medications = new ArrayList<>(); // Initialize the list of medications
    }

    // Methods

    // Adds a medication to the list
    public void addMedication(String medication) {
        medications.add(medication);    // Add the medication to the list
    }

    public String getCondition() {
		return condition;
	}
    
    // Returns a list of medications for a given condition
    public ArrayList<String> getMedications(String condition) {
        // Check if the current condition contains the given condition
        if (this.condition.contains(condition)) {
            return medications;  // Return the list of medications if the condition matches
        }
        return null;  // Return null if the risk type doesn't match
    }

    // Overridden toString method to display the medication details
    @Override
    public String toString() {
        // Initialize the result string with the condition
        String result = "Medication for " + condition + ":\n";
        // Loop through the medications list and append each medication to the result string
        for (String med : medications) {
            result += "- " + med + "\n";
        }
        return result;  // Return the result string
    }
}
