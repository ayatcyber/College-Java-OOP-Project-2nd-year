package ClinicHeartSystem;

import java.util.ArrayList;

public class Advice {
    // Fields
    private String riskType;            // Stores the risk type (e.g., "High Blood Pressure")
    private ArrayList<String> adviceList; // Holds a list of advice related to the risk

    // Constructor
    public Advice(String riskType) {
        this.riskType = riskType;      // Set the risk type (e.g., "High Blood Pressure")
        adviceList = new ArrayList<>(); // Initialize the list to store advice
    }

    // Methods
    
    // Adds a piece of advice to the list
    public void addAdvice(String advice) {
        adviceList.add(advice); // Add the advice to the list
    }

    // Retrieves the list of advice for the given risk type
    public ArrayList<String> getAdvice(String riskType) {
        // If the risk type matches, return the advice list
        if (this.riskType.contains(riskType)) {
            return adviceList;
        }
        // Return null if the risk type doesn't match
        return null;
    }

    public String getRiskType() {
		return riskType;
	}
    
    // String representation of the object
    @Override
    public String toString() {
        // Build the string representation by concatenating the risk type and advice list
        String result = "Risk Type: " + riskType + ", Advice: " + adviceList + "\n";
        return result;
    }
}
