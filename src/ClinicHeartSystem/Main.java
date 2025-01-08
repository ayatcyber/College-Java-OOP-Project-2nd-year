package ClinicHeartSystem;

import java.util.Scanner;

public class Main {
    public static void displayAdviceAndMedications(Patient patient) {
        System.out.println("Advice and Medications for " + patient.getName() + ":");

        // Check if the patient is at risk
        if (patient.isAtRisk()) {
            System.out.println("This patient is at risk based on recent health records.");
            if (patient.getAdvices().isEmpty()) {
                System.out.println("No advice available.");
            } else {
                for (Advice advice : patient.getAdvices()) {
                    System.out.println(advice);
                }
            }
            if (patient.getMedications().isEmpty()) {
                System.out.println("No medications prescribed.");
            } else {
                for (Medication medication : patient.getMedications()) {
                    System.out.println(medication);
                }
            }
        }

        else {
			System.out.println("Patient Don't need any Medicatuions or Adivces");
		}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Patient 1
        System.out.println("Enter details for Patient 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        System.out.print("Workplace: ");
        String Workplace1 = scanner.nextLine();
        System.out.print("City: ");
        String city1 = scanner.nextLine();

        Patient patient1 = new Patient(name1, age1, Workplace1, city1);

        // Blood Pressure records for Patient 1
        System.out.println("Enter Blood Pressure records for Patient 1:");
        System.out.print("Systolic (BP1): ");
        int systolic1 = scanner.nextInt();
        System.out.print("Diastolic (BP1): ");
        int diastolic1 = scanner.nextInt();
        BloodPressure bp1 = new BloodPressure(systolic1, diastolic1);

        System.out.print("Systolic (BP2): ");
        int systolic2 = scanner.nextInt();
        System.out.print("Diastolic (BP2): ");
        int diastolic2 = scanner.nextInt();
        BloodPressure bp2 = new BloodPressure(systolic2, diastolic2);

        patient1.addBloodPressureRecord(bp1);
        patient1.addBloodPressureRecord(bp2);

        // Heart Rate records for Patient 1
        System.out.println("Enter Heart Rate records for Patient 1:");
        System.out.print("Heart Rate (HR1): ");
        int hr1 = scanner.nextInt();
        HeartRate heartRate1 = new HeartRate(hr1);

        System.out.print("Heart Rate (HR2): ");
        int hr2 = scanner.nextInt();
        HeartRate heartRate2 = new HeartRate(hr2);

        patient1.addHeartRateRecord(heartRate1);
        patient1.addHeartRateRecord(heartRate2);

        // Create a Patient 2
        scanner.nextLine(); // consume the newline
        System.out.println("\nEnter details for Patient 2:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        System.out.print("Workplace: ");
        String Workplace2 = scanner.nextLine();
        System.out.print("City: ");
        String city2 = scanner.nextLine();

        Patient patient2 = new Patient(name2, age2, Workplace2, city2);

        // Blood Pressure records for Patient 2
        System.out.println("Enter Blood Pressure records for Patient 2:");
        System.out.print("Systolic (BP1): ");
        int systolic3 = scanner.nextInt();
        System.out.print("Diastolic (BP1): ");
        int diastolic3 = scanner.nextInt();
        BloodPressure bp3 = new BloodPressure(systolic3, diastolic3);

        System.out.print("Systolic (BP2): ");
        int systolic4 = scanner.nextInt();
        System.out.print("Diastolic (BP2): ");
        int diastolic4 = scanner.nextInt();
        BloodPressure bp4 = new BloodPressure(systolic4, diastolic4);

        patient2.addBloodPressureRecord(bp3);
        patient2.addBloodPressureRecord(bp4);

        // Heart Rate records for Patient 2
        System.out.println("Enter Heart Rate records for Patient 2:");
        System.out.print("Heart Rate (HR1): ");
        int hr3 = scanner.nextInt();
        HeartRate heartRate3 = new HeartRate(hr3);

        System.out.print("Heart Rate (HR2): ");
        int hr4 = scanner.nextInt();
        HeartRate heartRate4 = new HeartRate(hr4);

        patient2.addHeartRateRecord(heartRate3);
        patient2.addHeartRateRecord(heartRate4);

        // High Blood Pressure Advice and Medication
        Advice highBpAdvice = new Advice("High Blood Pressure");
        highBpAdvice.addAdvice("Reduce salt intake.");
        highBpAdvice.addAdvice("Exercise regularly.");

        Medication highBpMedication = new Medication("High Blood Pressure");
        highBpMedication.addMedication("Amlodipine");
        highBpMedication.addMedication("Lisinopril");

        // High Heart Rate Advice and Medication
        Advice highHrAdvice = new Advice("High Heart Rate");
        highHrAdvice.addAdvice("Avoid caffeine.");
        highHrAdvice.addAdvice("Practice stress-relief techniques.");

        Medication highHrMedication = new Medication("High Heart Rate");
        highHrMedication.addMedication("Beta-blockers");

        // Low Blood Pressure Advice and Medication
        Advice lowBpAdvice = new Advice("Low Blood Pressure");
        lowBpAdvice.addAdvice("Increase salt intake.");
        lowBpAdvice.addAdvice("Drink more fluids.");
        lowBpAdvice.addAdvice("Wear compression stockings.");

        Medication lowBpMedication = new Medication("Low Blood Pressure");
        lowBpMedication.addMedication("Fludrocortisone");
        lowBpMedication.addMedication("Midodrine");

        // Low Heart Rate Advice and Medication
        Advice lowHrAdvice = new Advice("Low Heart Rate");
        lowHrAdvice.addAdvice("Avoid alcohol.");
        lowHrAdvice.addAdvice("Increase physical activity.");
        lowHrAdvice.addAdvice("Eat small meals more frequently.");

        Medication lowHrMedication = new Medication("Low Heart Rate");
        lowHrMedication.addMedication("Atropine");
        lowHrMedication.addMedication("Isoproterenol");

        // Associate advice and medications with patient1
        patient1.addAdvice(highBpAdvice);
        patient1.addAdvice(highHrAdvice);
        patient1.addMedication(highBpMedication);
        patient1.addMedication(highHrMedication);

        // Associate advice and medications with patient2
        patient2.addAdvice(lowBpAdvice);
        patient2.addAdvice(lowHrAdvice);
        patient2.addMedication(lowBpMedication);
        patient2.addMedication(lowHrMedication);

        // Create a Clinic and add patients
        Clinic clinic = new Clinic("Baghdad Medical Center");
        clinic.addPatient(patient1);
        clinic.addPatient(patient2);

        // Display clinic information     
        clinic.displayClinicInfo();

        // Display advice and medications for each patient using the new method
        displayAdviceAndMedications(patient1);
        displayAdviceAndMedications(patient2);

        scanner.close();
    }
}
