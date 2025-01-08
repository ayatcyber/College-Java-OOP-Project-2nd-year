package ClinicHeartSystem;

public class BloodPressure {
    // Fields
    private int systolic;       // systolic blood pressure value
    private int diastolic;      // Diastolic blood pressure value
    private String riskLevel;   // The risk level (e.g., "High Risk", "Medium Risk", or "Normal")

    // Constructor
    public BloodPressure(int systolic, int diastolic) {
        this.systolic = systolic;        // Set the systolic value
        this.diastolic = diastolic;      // Set the diastolic value
        calculateRiskLevel();            // Calculate the risk level based on the blood pressure values
    }

    // Methods

    // Determines the risk level based on systolic and diastolic values
    protected void calculateRiskLevel() {
        // High risk if systolic is greater than 140 or diastolic is greater than 90
        if (systolic > 140 || diastolic > 90) {
            riskLevel = "High Risk";
        }
        // Medium risk if systolic is between 120 and 140, or diastolic is between 80 and 90
        else if (systolic >= 120 || diastolic >= 80) {
            riskLevel = "Medium Risk";
        }
        // Normal if systolic is less than 120 and diastolic is less than 80
        else {
            riskLevel = "Normal";
        }
    }

    // Returns a string representation of the blood pressure values
    public String getPressureInfo() {
        return "Systolic: " + systolic + ", Diastolic: " + diastolic;
    }

    // Returns the current risk level
    public String getRiskLevel() {
        return riskLevel;
    }
}

