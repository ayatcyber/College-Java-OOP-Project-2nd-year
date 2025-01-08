package ClinicHeartSystem;

public class HeartRate {
    // Fields
    private int bpm;              // Heart rate in beats per minute (BPM)
    private String riskLevel;     // The risk level based on the heart rate

    // Constructor
    public HeartRate(int bpm) {
        this.bpm = bpm;             // Set the heart rate value (BPM)
        calculateRiskLevel();       // Calculate the risk level based on the BPM value
    }

    // Methods

    // Determines the risk level based on the heart rate (BPM)
    protected void calculateRiskLevel() {
        // High risk if BPM is less than 60 or greater than 100
        if (bpm < 60 || bpm > 100) {
            riskLevel = "High Risk";
        }
        // Medium risk if BPM is between 60 and 70 (inclusive)
        else if (bpm >= 60 && bpm <= 70) {
            riskLevel = "Medium Risk";
        }
        // Normal if BPM is between 71 and 100 (inclusive)
        else {
            riskLevel = "Normal";
        }
    }

    // Returns a string with both BPM and risk level information
    public String getHeartRateInfo() {
        return "BPM: " + bpm + ", Risk Level: " + riskLevel;
    }

    // Returns the current risk level
    public String getRiskLevel() {
        return riskLevel;
    }
}
